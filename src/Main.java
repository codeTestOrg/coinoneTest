import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Set your API Key
        Map<String, String> apikey = new HashMap<>();
        apikey.put("access_token", "d62b3bcd-b2f2-48d3-a191-13874889995a");
        apikey.put("secret", "06b90939-1e8b-4eba-866e-005d1e0baf97");
        apikey.put("nonce", String.valueOf(0)); // if you get Exception, you should increase this value.

        CoinoneComm comm = new CoinoneComm(apikey);

        try {
            double ethBal = comm.getBalance(CoinoneComm.COIN_ETH);
            long totBal = comm.getCompleteBalance();
            int etcPrice = comm.getMarketPrice(CoinoneComm.COIN_ETC);

            System.out.println(
                      "이더리움 : " + ethBal + ".\n"
                    + "총금액 : " + totBal + " .\n"
                    + "기타그맥 : " + etcPrice + ".\n"
            );
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
