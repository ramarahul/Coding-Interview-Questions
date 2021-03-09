class Solution {
    public String solveEquation(String equation) {
        
        int[] leftHandSide = evaluateExpression(equation.split("=")[0]);
        int[] rightHandSide = evaluateExpression(equation.split("=")[1]);
        
        if(leftHandSide[0]==rightHandSide[0] && leftHandSide[1]==rightHandSide[1]){
            return "Infinite solutions";
        }
        else if(leftHandSide[0]==rightHandSide[0]){
            return "No solution";
        }
        else{
            
            return "x="+((rightHandSide[1]-leftHandSide[1])/(leftHandSide[0]-rightHandSide[0]));
        }
        
        
    }
    
    public int[] evaluateExpression(String expression){
        String[] tokens = expression.replace("+","#+").replace("-","#-").split("#");
        int[] result = new int[2]; //For coefficient of x and constant
        for(String token: tokens){
            if(token.equals("+x") || token.equals("x")){
                result[0]++;
            }
            else if(token.equals("-x")){
                result[0]--;
            }
            else if(token.contains("x")){
                result[0] += Integer.parseInt(token.substring(0, token.length()-1));
            }
            else{
                if(!token.equals(""))
                    result[1] += Integer.parseInt(token);
            }
        }
        
        return result;
    }
}
