class Solution {
    public String intToRoman(int num) {
        
        Numeral[] numerals = { new Numeral("M",1000),
                              new Numeral("CM",900),
                              new Numeral("D",500),
                             new Numeral("CD",400),
                             new Numeral("C",100),
                              new Numeral("XC",90),
                             new Numeral("L",50),
                             new Numeral("XL",40),
                             new Numeral("X",10),
                             new Numeral("IX",9),
                             new Numeral("V",5),
                             new Numeral("IV",4),
                             new Numeral("I",1)
                             };
        
        String result = "";
        for(Numeral numeral : numerals){
            int numberOfSymbols = num / numeral.value;
            if(numberOfSymbols!=0) result += numeral.symbol.repeat(numberOfSymbols);
            num = num % numeral.value;
        }
        
        return result;
        
    }
    
    
    class Numeral{
        public String symbol;
        public int value;
        public Numeral(String symbol, int value){
            this.symbol = symbol;
            this.value = value;
        }
    }
}

