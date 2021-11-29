//package HomeWorck.bracechecker;
//
//import java.util.Stack;
//
//public class BraceChecker {
//    private String text;
//
//    public BraceChecker(String text) {
//        this.text = text;
//    }
//
//    public void check() {
//        Stack stack = new Stack();
//
//        for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//            int pop;
//            switch (c) {
//                case '(':
//                case '{':
//                case '[':
//                    stack.push(c);
//                    break;
//                case ')':
//                    pop = stack.pop();
//                    if (pop != '(') {
//                        System.err.println("error: Close " + c +
//                                "but opened " + (char) pop + "at: " + i);
//                    }
//                    break;
//                case '}':
//                    pop = stack.pop();
//                    if (pop != '{') {
//                        System.err.println("error: Close " + c +
//                                "but opened " + (char) pop + "at: " + i);
//                    }
//                    break;
//                case '[':
//                    pop = stack.pop();
//                    if (pop != '{') {
//                        System.err.println("error: Close " + c +
//                                "but opened " + (char) pop + "at: " + i);
//                        break;
//
//                    }
//            }
//        }
//    }
//}
//
