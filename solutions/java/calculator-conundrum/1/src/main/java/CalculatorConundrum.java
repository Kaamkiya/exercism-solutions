class CalculatorConundrum {
    public String calculate(int a, int b, String operation) {
        int val = 0;
        switch (operation) {
            case "+": val = a + b; break;
            case "*": val = a * b; break;
            case "-": val = a - b; break;
            case "/":
                try {
                    val = a / b;
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
                break;
            case null: throw new IllegalArgumentException("Operation cannot be null");
            case "": throw new IllegalArgumentException("Operation cannot be empty");
            default: throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        return String.format("%d %s %d = %d", a, operation, b, val);
    }
}
