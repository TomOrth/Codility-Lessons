
public class BinGap{
	public int solution(int N) {
        String[] binNum = Integer.toBinaryString(N).replace("0+$", "").split("");
        int finBinGap = 0, tmpBinGap = 0;
        for(int i = 0; i < binNum.length; ++i){
            tmpBinGap += binNum[i].equals("0") ? 1 : 0;
            if(binNum[i].equals("1")){
                finBinGap = tmpBinGap > finBinGap ? tmpBinGap : finBinGap;
                tmpBinGap = 0;
            }
        }
        return finBinGap;
    }	
}
