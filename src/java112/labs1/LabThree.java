package java112.labs1;

/**
LabThree built for Lab 3 - Adv Java - Louis Kaplan
*/

public class LabThree{

    public static void main(String[] args){
        LabThree labThree = new LabThree();

        if (args.length !=1){
            System.out.println("Please enter one argument on the command line");
        } else {
            labThree.run(args[0]);
        }  
    }

    public void run(String inputString){
        System.out.println("input: " + inputString);
    }
}

