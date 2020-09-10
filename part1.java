/**
 * This is my first practice in bioinfrmatics.
 * 
 * @author (Atheer) 
 * @version (v1 - 10/9/2020)
 */
public class part1 {
   String findSimpleGene(String DNA) {
      String result = "No DNA";
      int startDNA = DNA.indexOf("ATG");
      if (startDNA != -1) {
         int stopDNA = DNA.indexOf("TAA", startDNA + 3);
         if (stopDNA != -1) {
            if ((startDNA-stopDNA)%3==0){
                result = "";
                result = DNA.substring(startDNA, stopDNA + 3);
            }
         }
      }
      return result;
   }
   void testSimpleGene (){
       String dna1 ="AAATTTAAA";
       String dna2 ="ATGAAATTT";
       String dna3 ="AAATTT";
       String dna4 ="ATGAATTAAA";
       String dna5 ="ATGAATTTAAA"; 
       System.out.println("The result of dna1: " + findSimpleGene(dna1));
       System.out.println("The result of dna2: " + findSimpleGene(dna2));
       System.out.println("The result of dna3: " + findSimpleGene(dna3));       
       System.out.println("The result of dna4: " + findSimpleGene(dna4));
       System.out.println("The result of dna5: " + findSimpleGene(dna5));    
    }
}
