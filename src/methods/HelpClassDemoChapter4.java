package methods;

class Help {
    void helpOn(int what) {
        switch (what) {
            case '1':
                System.out.println("the if : \n");
                System.out.println("if(condition) statement; ");
                System.out.println("else statement ");
                break;

            case '2':
                System.out.println("The switch : \n");
                System.out.println("switch(expression) { ");
                System.out.println("   case constant : ");
                System.out.println("   statement sequence ");
                System.out.println("   break; ");
                System.out.println("   // ... ");
                System.out.println("}");
                break;

            case '3':
                System.out.println("The for :\n");
                System.out.println("for (init; condition; iterator)");
                System.out.println(" statement");
                break;

            case '4':
                System.out.println("The while :\n");
                System.out.println("while(condiiton ) statement;");
                break;

            case '5':

        }

    }
}


public class HelpClassDemoChapter4 {

}
