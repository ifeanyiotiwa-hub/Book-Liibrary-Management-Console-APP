package libusertype;

public enum UserType {
    JNR_STUDENT(1), SNR_STUDENT(2), TEACHER(3);

    private int queuePrecedence;
    UserType(int queuePrecedence){
        this.queuePrecedence = queuePrecedence;
    }
    public int getQueuePrecedence(){
        return this.queuePrecedence;
    }
}
