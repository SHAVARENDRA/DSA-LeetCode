class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        // for(String sentence:sentences)
        // {
        //     String[] res=sentence.split(" ");
        //     int res1=res.length;
        //     max=Math.max(max,res1);
        // }
        // return max;
    for(int i=0;i<sentences.length;i++)
    {
        String s=sentences[i];
        String[]str=s.split(" ");
        int maxi=str.length;
        max=Math.max(maxi,max);


        

    }
    return max;

    
    }
}