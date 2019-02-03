import java.util.ArrayDeque;
import java.util.Deque;

public class Kalkulator {
    public int oblicz(final String input){

        Deque<String> stos = new ArrayDeque<>();
        String [] skladowe = input.split(" ");
        for (String skladowa: skladowe){
            stos.add(skladowa);
        }
        while(stos.size()>1){
            int left = Integer.parseInt(stos.pop());
            String znak = stos.pop();
            int right = Integer.parseInt(stos.pop());

            int result = 0;
            switch (znak){
                case "+":
                    result = left + right;
                    break;

                case  "-":
                    result = left - right;
                    break;
            }
            stos.push(String.valueOf(result));
        }
        return Integer.parseInt(stos.pop());

    }
}
