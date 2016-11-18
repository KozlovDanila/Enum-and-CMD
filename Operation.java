public enum Operation {
    SUB(new Substruction()), ADD(new Addition()), MULT(new Multiplication()), DIV(new Division());

    Calculator ret;

    Operation(Calculator operation) {
        ret = operation;
    }

    public double calculate(int first, int second) {
        return ret.calculate(first, second);
    }
}
