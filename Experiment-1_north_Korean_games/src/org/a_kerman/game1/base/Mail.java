package org.a_kerman.game1.base;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iv-g-ru
 */
public class Mail {

    private final List<Letter> letters = new ArrayList<>();

    public void send(Structure sender, String message, Resource box, Structure recipient) {
        Letter letter = new Letter(message, box, sender, recipient);
        synchronized (letters) {
            letters.add(letter);
        }
    }

    public void send(Letter letter) {
        synchronized (letters) {
            letters.add(letter);
        }
    }

    public List<Letter> get(Structure recipient, int max) {
        List<Letter> ls = new ArrayList<>();
        List<Integer> is = new ArrayList<>();
        synchronized (letters) {
            for (int i = 0; i < letters.size() && ls.size() < max; i++) {
                Letter letter;
                letter = letters.get(i);
                if (letter.recipient == recipient) {
                    ls.add(letter);
                    is.add(i);
                }
            }

            int n = 0;
            for (int i = 0; i < is.size(); i++) {
                int j = is.get(i) - n;
                letters.remove(j);
                n++;
            }
        }
        return ls;
    }

    public static class Letter {

        private String message;
        private Resource box; //can be null
        private Structure sender;
        private Structure recipient;

        public String getMessage() {
            return message;
        }

        public Resource getBox() {
            return box;
        }

        public void setRecipient(Structure recipient) {
            this.recipient = recipient;
        }

        private Letter(String message, Resource box, Structure sender, Structure recipient) {
            this.message = message;
            this.box = box;
            this.sender = sender;
            this.recipient = recipient;
        }

    }
}
