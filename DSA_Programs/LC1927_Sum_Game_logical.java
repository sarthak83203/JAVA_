class Solution {
    public boolean sumGame(String num) {
        //isme hame question me bola he half tak jana he
        //now isme ye dyan rakhna ki number of question mark also matters
        //isme questionn matter isliye kar raha he maan lo ki leftt most me  one question mark he
        //and right most me 3 he to alice plays first accoding to question to alice pehele to 9 dalegi
        //kyuki aalice chahati he ki sum equal na ho to right me bob dalega jo chahata he sum equal ho to vo bhi 9 dalega baad me ati he alice ki bari
        //vo chahiti he ki sum equal na ho to vo dehegi ki sum equal hoga agar jyada bada number dala to par situation aisi he ki alice kuch bhi dale par bob to juitega hi try 2nd test case you will get to know

        int leftSum=0;
        int n=num.length();
        int rightSum=0;
        int leftQ=0;
        int rightQ=0;
        //ye left most part ka ho gaya 
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                leftQ++;
            }else{
                leftSum+=num.charAt(i)-'0';
            }

        }
        //ye rightmost part he 
        //yes count of  question mark matters kyuki alice ki bari agar left me ayi to ya jaha par bhi ayi to sum not equal karne ki koshis karega 
        //isliye question mark matter and also matter becuase the alice and bob alternate chalte he to game ka goal affect ho sakta he


        for(int i=n/2;i<num.length();i++){
            if(num.charAt(i)=='?'){
                rightQ++;
            }else{
                rightSum+=num.charAt(i)-'0';
            }
        }
        //the original formula is (leftSum-rightSum) =(rightQ-leftQ)/2*9 but in java accroding to int is not valid so multiple both side by 2 according to math theory

        return (leftSum-rightSum) * 2!=(rightQ-leftQ)*9;


        
    }
}