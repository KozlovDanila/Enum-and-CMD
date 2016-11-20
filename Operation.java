public enum Operation {
    SUB(new Substruction()), ADD(new Addition()), MULT(new Multiplication()), DIV(new Division());

    Calculator operation;

    Operation(Calculator operation) {
        this.operation = operation;
    }

    public double calculate(int first, int second) {
        return operation.calculate(first, second);
    }
}
