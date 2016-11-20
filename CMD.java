import org.apache.commons.lang.ArrayUtils;

public class CMD {
    public static void main(String[] args) {
        if (args != null) {
            System.out.println(calculateFromComandLine(args));
        }
    }

    private static double calculateFromComandLine(String[] args) {
        int leftOperand = getOperand(args, "-l");
        int rightOperand = getOperand(args, "-o");
        String operation = getOperation(args);
        operation = operation.toUpperCase();
        Operation ret = Operation.valueOf(operation);
        return ret.calculate(leftOperand, rightOperand);
    }

    private static String getOperation(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("sub") || args[i].equals("mult") || args[i].equals("add") || args[i].equals("div")) {
                return args[i];
            }
        }
        return null;
    }

    private static int getOperand(String[] args, String operand) {
        int indexOfRight = ArrayUtils.indexOf(args, operand);
        if (checkNegativeValue(indexOfRight)) {
            throw new IllegalArgumentException();
        }
        if (!checkBorder(indexOfRight + 1, args.length)) {
            throw new IllegalArgumentException();
        }
        if (!checkNumber(args, indexOfRight + 1)) {
            throw new IllegalArgumentException();
        }
        return Integer.parseInt(args[indexOfRight + 1]);
    }

    private static boolean checkNumber(String[] args, int i) {
        String str = args[i];
		if (str.charAt(0) == '-') {
			return str.charAt(1) > '0' && str.charAt(1) < '9';
		} else {
			return str.charAt(0) > '0' && str.charAt(0) < '9';
		}
    }

    private static boolean checkBorder(int i, int length) {
        return i < length;
    }

    private static boolean checkNegativeValue(int indexOfRight) {
        return indexOfRight < 0;
    }
}
