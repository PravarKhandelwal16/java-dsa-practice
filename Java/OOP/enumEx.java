enum Status {
    Running, 
    Failed,
    Exception,
    Error
}

public class enumEx {
    public static void main(String[] args) {
        Status s = Status.Running;
        Status d = Status.Error;
        System.out.println(s);
        System.out.println(d.ordinal());

        switch(d){
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Exception:
                System.out.println("Please Check");
                break;
            case Error:
                System.out.println("There is some error");
                break;
        }

    }
}
