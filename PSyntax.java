import java.util.Scanner;

//Operators 
class Operators {
    public void Arithmetic() {
        System.out.println("Variable 1 + Variable 2");
        System.out.println("Variable 1 - Variable 2");
        System.out.println("Variable 1 * Variable 2");
        System.out.println("Variable 1 / Variable 2");
        System.out.println("Variable 1 % Variable 2");
    }

    public void Assignment() {
        System.out.println("Variable1 = value");
        System.out.println("Variable1 += value");
        System.out.println("Variable1 -= value");
        System.out.println("Variable1 *= value");
        System.out.println("Variable1 /= value");
        System.out.println("Variable1 %= value");
        System.out.println("Variable1 &= value");
        System.out.println("Variable1 |= value");
        System.out.println("Variable1 ^= value");
        System.out.println("Variable1 >>= value");
        System.out.println("Variable1 <<= value");
    }

    public void Rational() {
        System.out.println("Variable1 > Variable2");
        System.out.println("Variable1 < Variable2");
        System.out.println("Variable1 >= Variable2");
        System.out.println("Variable1 <= Variable2");
        System.out.println("Variable1 == Variable2");
        System.out.println("Variable1 != Variable2");

    }

    public void Logical() {
        System.out.println("Variable1>1 && Variable1<10");
        System.out.println("Variable1>1 || Variable1<10");
        System.out.println("!(Variable1>1 && Variable1<10)");
    }

    public void Bitwise() {
        System.out.println("Variable1 & Variable2");
        System.out.println("Variable1 | Variable2");
        System.out.println("Variable1=value << 1 ");
        System.out.println("Variable1=value >> 1 ");
        System.out.println("Variable1=~value");
        System.out.println("Variable1 ^ Variable2");
    }

    public void Ternary() {
        System.out.println("(//Condition)? a:b");
    }
}

// Conditional statment
class Condition {
    public void If() {
        System.out.println("if(//Condition){\n//Statement to be executed\n}");
    }

    public void If_else() {
        System.out.println("if(//Condition){\n//Statement to be executed\n}else{\n//Statement to be executed\n}");
    }

    public void else_If() {
        System.out.println(
                "if(//Condition){\n//Statement to be executed\n}else if(//Condition){\n//Statement to be executed\n}");
    }

    public void _Switch_Case() {
        System.out.println("switch(//key){\ncase value:\n//statement\nbreak;\ndefault:\nbreak;}");
    }
}

// Loops
class Loops {
    public void While() {
        System.out.println("while(//Condition){\n//Statement to be executed\n}");
    }

    public void DoWhile() {
        System.out.println("do{\n/Statement to be executed\n}(Condition)");
    }

    public void ForLoop() {
        System.out.println("for(//initialization;//condition;//increment){\n//statement\n}");
    }
}

// Break & continue
class Break {
    public void _break() {
        System.out.println("while(//Condition){\n//Statement to be executed\nbreak;\n}");
    }

    public void _continue() {
        System.out.println("while(//Condition){\n//Statement to be executed\ncontinue;\n}");
    }
}
// Methods

class Methods {
    public void Methode() {
        System.out.println(
                "public class Main{\nstatic void myMethode(){\n//code to be executed\n   }\npublic static void main(String[] args){\nmyMethode();\n  }\n}");
    }

    public void Methode_Parameter() {
        System.out.println(
                "public class Main{\nstatic void myMethode(parameter1(ex-int 1),parameter2(ex int num2)){\n//code to be executed\n   }\npublic static void main(String[] args){\nmyMethode();\n  }\n}");
        System.out.println(
                "//return type\npublic class Main{\nstatic int myMethode(parameter1(ex-int 1),parameter2(ex int num2)){\n//code to be executed \nreturn value;\n   }\npublic static void main(String[] args){\nmyMethode();}\n}");
    }

    public void Methode_Overloading() {
        System.out
                .println("int myMethod(int x){\ncode to executed\n}\nint myMethode(int x,int y){\ncode to execute}\n");
    }
}
// OPPs

class Obj_Class {
    public void Class() {
        System.out.println("// To create a class \nclass MyClass{\n//class atributes and methodes\n}");
    }

    public void Obj() {
        System.out.println(
                "//To create  objects\npublic class main{\npublic static void main(String[] args){\nMyClass Car=new MyClass //now we can use this object created\n  }\n} ");
    }

    public void Atributes_Method() {
        System.out.println(
                "//atributes & methodes are defined under a class\nclass MyClass{\nString Car;\nint model;\n//We can also define methodes inside the classs\n public void MyMethod(){\n //Code to be executed\n  }\n}");
    }

    public void Constructor() {
        System.out.println(
                "//Constructors are special method \nNote that the constructor name must match the class name, and it cannot have a return type (like void).");
    }

    public void Constructor_p() {
        System.out.println(
                "//Constructor parameter\nclass MyClass{\npublic int MyClass(int parameter_1,int parameter_2){\nthis.parameter_1=parameter_1;\nthis.parameter_2=parameter_2;\n   }\n}");
    }

    // Modifiers
    public void Modifiers() {
        System.out.println(
                "//We divide modifiers into two groups:\n//Access Modifiers - controls the access level\n//Non-Access Modifiers - do not control access level, but provides other functionality\n//for classes\nModifier       Description\npublic        \tThe class is accessible by any other class\ndefault        The class is only accessible by classes in the same package. This is used when you don't specify a modifier.\nFor attributes, methods and constructors\nModifier        Description\npublic      The code is accessible for all classes\nprivate        The code is only accessible within the declared class\ndefault      The code is only accessible in the same package. This is used when you don't specify a modifier.\nprotected      The code is accessible in the same package and subclasses.\nFor attributes and methods\nModifier       Description\nfinal      Attributes andd methode cannot be overridden/modified\nstatic       Attributes and methods belongs to the class, rather than an object\nabstract        Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).\ntransient        Attributes and methods are skipped when serializing the object containing them\nsynchronized        Methods can only be accessed by one thread at a time\nvolatile      The value of an attribute is not cached thread-locally, and is always read from the \"main memory\"");
    }
}

public class PSyntax {
    static void Basic() {
        System.out.println(
                "public class YourClass{\npublic static void main(String[]args){\n System.out.println(\"Hello world\")\n    }\n}");
    }

    public static void main(String[] args) {
        // Objects
        Scanner sc = new Scanner(System.in);
        Operators OP = new Operators();
        Condition Con = new Condition();
        Loops l = new Loops();
        Break B = new Break();
        Methods M = new Methods();
        Obj_Class O = new Obj_Class();

        System.out.println("1)Basic syntax for java");
        System.out.println("2)Operators");
        System.out.println("3)if conditions in java");
        System.out.println("4)Loops");
        System.out.println("5)Break and Continue");
        System.out.println("6)Methods");
        System.out.println("7)OOPs");
        System.out.println("Enter your response");
        int value = sc.nextInt();
        // while (true) {
        switch (value) {
            // Basic syntax
            case 1:
                Basic();
                break;
            // Operators in java
            case 2:
                System.out.println("Which  type of operattion you want to perform");
                System.out.println(
                        "1)Aritmetic operators\n2)Assignment operators\n3)Rational operators\n4)Logical operators\n5)Bitwise operator\n6)Unary operator");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        OP.Arithmetic();
                        break;
                    case 2:
                        OP.Assignment();
                        break;
                    case 3:
                        OP.Rational();
                        break;
                    case 4:
                        OP.Logical();
                        break;
                    case 5:
                        OP.Bitwise();
                        break;
                    case 6:
                        OP.Ternary();
                        break;

                    default:
                        System.out.println("invalide input");
                        break;
                }
                break;
            // If statements in java

            case 3:
                System.out.println("1)if \n2)else\n3)else if");
                int con = sc.nextInt();

                switch (con) {
                    case 1:
                        Con.If();
                        break;
                    case 2:
                        Con.If_else();
                        break;
                    case 3:
                        Con.else_If();
                        break;
                    case 4:
                        Con._Switch_Case();
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                System.out.println("1)while loop\n2)do while loop\n3)for loop");
                int L = sc.nextInt();
                switch (L) {
                    case 1:
                        l.While();
                        break;
                    case 2:
                        l.DoWhile();
                        break;
                    case 3:
                        l.ForLoop();
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                System.out.println("1)break\n2)continue");
                int S = sc.nextInt();
                switch (S) {
                    case 1:
                        B._break();
                        break;
                    case 2:
                        B._continue();
                        break;
                    default:
                        break;
                }
                break;
            case 6:
                System.out.println("1)Method \n2)Method parameter\n3)Method Overloading");
                int m = sc.nextInt();
                switch (m) {
                    case 1:
                        M.Methode();
                        break;

                    case 2:
                        M.Methode_Parameter();
                        break;
                    case 3:
                        M.Methode_Overloading();
                    default:
                        break;
                }
                break;
            case 7:
                System.out.println(
                        "1)Class\n2)Objects\n3)atributes & methode\n4)Constructor\n5)Constructor with parameters\n6)Atributes Method\n7)Modifiers");
                int o = sc.nextInt();
                switch (o) {
                    case 1:
                        O.Class();
                        break;
                    case 2:
                        O.Obj();
                        break;
                    case 3:
                        O.Atributes_Method();
                        break;
                    case 4:
                        O.Constructor();
                        break;
                    case 5:
                        O.Constructor_p();
                        break;
                    case 6:
                        O.Atributes_Method();
                        break;
                    case 7:
                        O.Modifiers();
                    default:
                        break;
                }
                break;

            default:
                break;

        }
        // }
        sc.close();
        
    }
}