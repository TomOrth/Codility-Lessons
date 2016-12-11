import java.util.stream.Stream;

public class BinGapStream{
  public static int solution(int N){
    return(Stream.of(Integer.toBinaryString(N).replace("0+$", "").split("1+"))
                 .filter(x -> x != null)
                 .map(String::length)
                 .max(Integer::compare)
                 .orElse(0));
  }
}
