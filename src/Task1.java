import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("виберіть  клітинку на якій стоїть кінь");
        System.out.println("1. A1");
        System.out.println("2. A2");
        System.out.println("3. A3");
        System.out.println("4. A4");
        System.out.println("5. A5");
        System.out.println("6. A6");
        System.out.println("7. A7");
        System.out.println("8. A8");
        System.out.println("9. B1");
        System.out.println("10. B2");
        System.out.println("11. B3");
        System.out.println("12. B4");
        System.out.println("13. B5");
        System.out.println("14. B6");
        System.out.println("15. B7");
        System.out.println("16. B8");
        System.out.println("17. C1");
        System.out.println("18. C2");
        System.out.println("19. C3");
        System.out.println("20. C4");
        System.out.println("21. C5");
        System.out.println("22. C6");
        System.out.println("23. C7");
        System.out.println("24. C8");
        System.out.println("25. D1");
        System.out.println("26. D2");
        System.out.println("27. D3");
        System.out.println("28. D4");
        System.out.println("29. D5");
        System.out.println("30. D6");
        System.out.println("31. D7");
        System.out.println("32. D8");
        System.out.println("33. E1");
        System.out.println("34. E2");
        System.out.println("35. E3");
        System.out.println("36. E4");
        System.out.println("37. E5");
        System.out.println("38. E6");
        System.out.println("39. E7");
        System.out.println("40. E8");
        System.out.println("41. F1");
        System.out.println("42. F2");
        System.out.println("43. F3");
        System.out.println("44. F4");
        System.out.println("45. F5");
        System.out.println("46. F6");
        System.out.println("47. F7");
        System.out.println("48. F8");
        System.out.println("49. G1");
        System.out.println("50. G2");
        System.out.println("51. G3");
        System.out.println("52. G4");
        System.out.println("53. G5");
        System.out.println("54. G6");
        System.out.println("55. G7");
        System.out.println("56. G8");
        System.out.println("57. H1");
        System.out.println("58. H2");
        System.out.println("59. H3");
        System.out.println("60. H4");
        System.out.println("61. H5");
        System.out.println("62. H6");
        System.out.println("63. H7");
        System.out.println("64. H8");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Ви можете походити на тaкі клітинки: B3, C2");
        }
        if (a == 2) {
            System.out.println("Ви можете походити на тaкі клітинки: С4, C1, B4");
        }
        if (a == 3) {
            System.out.println("Ви можете походити на тaкі клітинки: B1, B5, C2, C4");
        }
        if (a == 4) {
            System.out.println("Ви можете походити на тaкі клітинки: B2, C3, C5, B6");
        }
        if (a == 5) {
            System.out.println("Ви можете походити на тaкі клітинки: B3, C4, C6, B7");
        }
        if (a == 6) {
            System.out.println("Ви можете походити на тaкі клітинки: B4, C5, C7, B8");
        }
        if (a == 7) {
            System.out.println("Ви можете походити на тaкі клітинки: B5, C6, C8");
        }
        if (a == 8) {
            System.out.println("Ви можете походити на тaкі клітинки: B6, C7");
        }
        if (a == 9) {
            System.out.println("Ви можете походити на тaкі клітинки: A3, C3, D2");
        }
        if (a == 10) {
            System.out.println("Ви можете походити на тaкі клітинки: A4, C4, D3, D1 ");
        }
        if (a == 11) {
            System.out.println("Ви можете походити на тaкі клітинки:A1, A5, C1, C5, D2, D4 ");
        }
        if (a == 12) {
            System.out.println("Ви можете походити на тaкі клітинки: A2, A6, C2, C6, D3, D5");
        }
        if (a == 13) {
            System.out.println("Ви можете походити на тaкі клітинки: A3, A7, C3, C7, D6, D4 ");
        }
        if (a == 14) {
            System.out.println("Ви можете походити на тaкі клітинки: A4, A8, C4, C8, D5, D7");
        }
        if (a == 15) {
            System.out.println("Ви можете походити на тaкі клітинки: A5, C5, D6, D8");
        }
        if (a == 16) {
            System.out.println("Ви можете походити на тaкі клітинки: A6, C6, D7");
        }
        if (a == 17) {
            System.out.println("Ви можете походити на тaкі клітинки: A2, B3, D3, E2");
        }
        if (a == 18) {
            System.out.println("Ви можете походити на тaкі клітинки: A1, A3, B4, D4, E1, E3");
        }
        if (a == 19) {
            System.out.println("Ви можете походити на тaкі клітинки: A2, A4, B1, B5, D5, D1, E2, E4 ");
        }
        if (a == 20) {
            System.out.println("Ви можете походити на тaкі клітинки: A3, A5, B6, B2, D2, D6, E5, E3");
        }
        if (a == 21) {
            System.out.println("Ви можете походити на тaкі клітинки: A4, A6, B3, B7, D3, D7, E4, E6");
        }
        if (a == 22) {
            System.out.println("Ви можете походити на тaкі клітинки: A5, A7, B4, B8, D4, D8, E5,E7 ");
        }
        if (a == 23) {
            System.out.println("Ви можете походити на тaкі клітинки: A6, A8, B5, D5, E6, E8 ");
        }
        if (a == 24) {
            System.out.println("Ви можете походити на тaкі клітинки: A7, B6, D6, E7 ");
        }
        if (a == 25) {
            System.out.println("Ви можете походити на тaкі клітинки: B2, C3, E3, F2");
        }
        if (a == 26) {
            System.out.println("Ви можете походити на тaкі клітинки: B1, B3, C4, E4, F1, F3 ");
        }
        if (a == 27) {
            System.out.println("Ви можете походити на тaкі клітинки: B2, B4, C1, C5, E1, E5, F2,F4");
        }
        if (a == 28) {
            System.out.println("Ви можете походити на тaкі клітинки:  B3, B5, C2, C6, E2, E6, F3, F5 ");
        }
        if (a == 29) {
            System.out.println("Ви можете походити на тaкі клітинки: B4, B6, C3, C7,E3, E7, F4,F6");
        }
        if (a == 30) {
            System.out.println("Ви можете походити на тaкі клітинки: B5, B7, C4, C8, E4, E8, F5, F7");
        }
        if (a == 31) {
            System.out.println("Ви можете походити на тaкі клітинки: B6, B8, C5, E5, F6, F8");
        }
        if (a == 32) {
            System.out.println("Ви можете походити на тaкі клітинки: B7, C6, E6, F7");
        }
        if (a == 33) {
            System.out.println("Ви можете походити на тaкі клітинки: C3, D3, F3, G2");
        }
        if (a == 34) {
            System.out.println("Ви можете походити на тaкі клітинки: C1, C3, D4, F4, G1, G3");
        }
        if (a == 35) {
            System.out.println("Ви можете походити на тaкі клітинки: C2, C4, D1, D5, F1, F5, G2, G4");
        }
        if (a == 36) {
            System.out.println("Ви можете походити на тaкі клітинки: C3, C5, D2, D6, F2, F6, G3, G5");
        }
        if (a == 37) {
            System.out.println("Ви можете походити на тaкі клітинки: C4, C6, D3, D7, F3, F7, G4, G6");
        }
        if (a == 38) {
            System.out.println("Ви можете походити на тaкі клітинки: C5, C7, D4, D8, F4, F8, G5, G7");
        }
        if (a == 39) {
            System.out.println("Ви можете походити на тaкі клітинки: C6, C8, D5, F5, G6, G8");
        }
        if (a == 40) {
            System.out.println("Ви можете походити на тaкі клітинки: C7, D6, F6, G7 ");
        }
        if (a == 41) {
            System.out.println("Ви можете походити на тaкі клітинки: D2, E3, G3, H2 ");
        }
        if (a == 42) {
            System.out.println("Ви можете походити на тaкі клітинки: D1, D3, E4, G4, H1, H3");
        }
        if (a == 43) {
            System.out.println("Ви можете походити на тaкі клітинки: D2, D4, E1, E5, G1, G5, H2, H4");
        }
        if (a == 44) {
            System.out.println("Ви можете походити на тaкі клітинки: D3, D5, E2, E6, G2, G6, H3, H5");
        }
        if (a == 45) {
            System.out.println("Ви можете походити на тaкі клітинки: D4, D6, E3, E7, G3, G7, H4, H6 ");
        }
        if (a == 46) {
            System.out.println("Ви можете походити на тaкі клітинки: D5, D7, E4, E8, G4, G8, H5, H7");
        }
        if (a == 47) {
            System.out.println("Ви можете походити на тaкі клітинки: D6, D8, E5, G5, H6, H8");
        }
        if (a == 48) {
            System.out.println("Ви можете походити на тaкі клітинки: D7, E6, G6,H7");
        }
        if (a == 49) {
            System.out.println("Ви можете походити на тaкі клітинки: E2, F3, H3");
        }
        if (a == 50) {
            System.out.println("Ви можете походити на тaкі клітинки: E1, E3, F4, H4");
        }
        if (a == 51) {
            System.out.println("Ви можете походити на тaкі клітинки: E2, E4, F1, F5, H1,H5");
        }
        if (a == 52) {
            System.out.println("Ви можете походити на тaкі клітинки: E3, E5, F2, F6, H2, H6");
        }
        if (a == 53) {
            System.out.println("Ви можете походити на тaкі клітинки: E4, E6, F3, F7, H3, H7");
        }
        if (a == 54) {
            System.out.println("Ви можете походити на тaкі клітинки: E5, E7, F4, F8, H4, H8");
        }
        if (a == 55) {
            System.out.println("Ви можете походити на тaкі клітинки: E6, E8, F5, H5");
        }
        if (a == 56) {
            System.out.println("Ви можете походити на тaкі клітинки: E7, F6, H6");
        }
        if (a == 57) {
            System.out.println("Ви можете походити на тaкі клітинки: F2, G3");
        }
        if (a == 58) {
            System.out.println("Ви можете походити на тaкі клітинки: F1, F3, G4");
        }
        if (a == 59) {
            System.out.println("Ви можете походити на тaкі клітинки: F2, F4, G1, G5");
        }
        if (a == 60) {
            System.out.println("Ви можете походити на тaкі клітинки: F3, F5, G2, G6");
        }
        if (a == 61) {
            System.out.println("Ви можете походити на тaкі клітинки: F4, F6, G3, G7");
        }
        if (a == 62) {
            System.out.println("Ви можете походити на тaкі клітинки: F5, F7, G4, G8");
        }
        if (a == 63) {
            System.out.println("Ви можете походити на тaкі клітинки: F6, F8, G5");
        }
        if (a == 64) {
            System.out.println("Ви можете походити на тaкі клітинки: F7, G6");
        }
        if (a <= 0) {
            System.out.println("Така позиція відсутня ");
        }
        if (a > 64) {
            System.out.println("Така позиція відсутня ");
        }
    }
}


