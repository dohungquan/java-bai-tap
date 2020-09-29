package BT5;

    public class Ex20Method {
        private Ex20Method1 com;
        private int score = 0;

        public Ex20Method() {
            this.com = new Ex20Method1();
        }

        public int logicGame(String message) {
            int point = 0;
            String turnCom = com.getCom_ai();
            if (message.equalsIgnoreCase("Keo")) {
                System.out.println(turnCom);
                if (turnCom.equalsIgnoreCase("Bao")) {
                    point++;
                } else if (turnCom.equalsIgnoreCase("Bua")) {
                    point--;
                }
            } else if (message.equalsIgnoreCase("Bao")) {
                System.out.println(turnCom);
                if (turnCom.equalsIgnoreCase("Bua")) {
                    point++;
                } else if (turnCom.equalsIgnoreCase("Keo")) {
                    point--;
                }
            } else {
                System.out.println(turnCom);
                if (turnCom.equalsIgnoreCase("Keo")) {
                    point++;
                } else if (turnCom.equalsIgnoreCase("Bao")) {
                    point--;
                }
            }
            return score += point;
        }

        public void checkWin() {
            if (score > 0) {
                System.out.println("You win");
            } else if (score < 0) {
                System.out.println("You lose");
            } else {
                System.out.println("Draw");
            }
        }
    }
