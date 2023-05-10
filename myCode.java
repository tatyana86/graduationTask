public class Main {

    /* Функция получает две строки, возвращает true,
        если вторая строка является подстрокой первой,
        иначе возвращает false */
    static boolean isSubstring(String s1, String s2) {
        // Проходимся по символам первой и второй строк,
		// сразу проверяем, "вмещается" ли s2 в s1 начиная с текущего индекса i:
        for(int i = 0; (i + s2.length()) <= s1.length(); i ++) { 
            int j = 0;
            for(j = 0; j < s2.length(); j ++) {
                // Проверяем равенство текущих символов:
                if(s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if(j == s2.length()) // вторая строка - подстрока первой, если прошли проверку всех символов в s2
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubstring("12345", "235"));
    }
}
