package Abstractions.Demo1;

public enum StudentStatus {
    REJECTED(1),
    ACCEPTED(13),
    PENDING(4),
    WAITING(6);

    private int code;
    StudentStatus(int code){
        this.code= code;
    }

    public int getCode(){
        return this.code;
    }
}
