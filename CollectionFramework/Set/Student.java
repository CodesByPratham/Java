package CollectionFramework.Set;

/* 
 * Here we implemented the Comparable interface to compare and sort the custom classes 
 * such as Students that can be seen in Collections/JavaCollections.java
 */
public class Student implements Comparable<Student> {

    public String name;
    public int rollNo;

    public Student(int rollNo, String name) {

        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {

        return "{Roll No: " + this.rollNo + " | Name: " + this.name + "}";
    }

    @Override
    public boolean equals(Object obj) {

        /*
         * Current Instance Check (this == obj): This condition checks if the current
         * instance (this) is exactly the same as the object being compared to (obj).
         */
        if (this == obj) {
            System.out.println("Present Object: " + obj);
            return true;
        }

        /*
         * Null Check (obj == null): Before casting or comparing further, it checks if
         * the passed object (obj) is null. Since a null reference is not equivalent to
         * any object, the method returns false immediately if obj is null. This
         * prevents NullPointerException which would occur if you attempt to access or
         * compare properties on a null reference.
         * 
         * Type Check (getClass() != obj.getClass()): This ensures that the object being
         * compared with is exactly of the same class as the current instance. This is
         * critical because even if two objects are conceptually similar but belong to
         * different classes (or subclasses), they should not be considered equal. For
         * instance, if there's a subclass ExtendedStudent with additional properties,
         * an instance of Student should not be considered equal to an instance of
         * ExtendedStudent even if their rollNo are the same.
         */
        if (obj == null || getClass() != obj.getClass()) {
            System.out.println(obj.getClass());
            return false;
        }

        Student student = (Student) obj;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        /*
         * It returns the hash code of the rollNo since our equality is based on this
         * field. Using Integer.hashCode(rollNo) provides a good distribution of hash
         * codes for integers.
         */
        return Integer.hashCode(rollNo);
    }

    @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }
}
