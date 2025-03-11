public class Classroom {
    private int classroomId;
    private String roomName;
    private int capacity;

    // Constructor
    public Classroom(int classroomId, String roomName, int capacity) {
        this.classroomId = classroomId;
        this.roomName = roomName;
        this.capacity = capacity;
    }

    // Getters and Setters
    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    // Assign a teacher to the classroom
    public boolean assignTeacher(int teacherID) {
        System.out.println("Teacher " + teacherID + " assigned to classroom " + classroomId);
        return true;
    }

    // Update the classroom capacity
    public void updateCapacity(int newCapacity) {
        this.capacity = newCapacity;
        System.out.println("Updated classroom capacity to: " + newCapacity);
    }
}
