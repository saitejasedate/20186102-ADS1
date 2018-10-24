class allotment {
/**
 * Alloting the seats to the studentsQualified based on merit.
 * @param studentsQualified  list of studentsQualified.
 * @param numOfvacancies number of numOfvacancies.
 * @param unreserved_vacancies Un-reserved category.
 * @param bc_vacancies      Number of BC seats.
 * @param sch_vacancies      Number of SC seats.
 * @param sct_vacancies      Number of ST seats.
 */
public static void allotment(final Student[] studentsQualified,
                             int numOfvacancies,
                             int unreserved_vacancies,
                             int bc_vacancies,
                             int sch_vacancies,
                             int sct_vacancies) {
    int i = 0;
    int k = 0;
    int N = studentsQualified.length;
    Student[] alloted = new Student[numOfvacancies];
    for (i = 0; i < N; i++) {
        if (numOfvacancies == 0) {
            break;
        }

        if (unreserved_vacancies > 0) {
            unreserved_vacancies--;
            studentsQualified[i].setAlloted(true);
            alloted[k] = studentsQualified[i];
            numOfvacancies--;
            k++;
        }

        if (bc_vacancies > 0) {
            if (studentsQualified[i].getreservation().equals("BC")
                    && studentsQualified[i].getAlloted() != true) {
                bc_vacancies--;
                studentsQualified[i].setAlloted(true);
                alloted[k] = studentsQualified[i];
                numOfvacancies--;
                k++;
            }
        }

        if (sch_vacancies > 0) {
            if (studentsQualified[i].getreservation().equals("SC")
                    && studentsQualified[i].getAlloted() != true) {
                sch_vacancies--;
                studentsQualified[i].setAlloted(true);
                alloted[k] = studentsQualified[i];
                numOfvacancies--;
                k++;
            }
        }

        if (sch_vacancies > 0) {
            if (studentsQualified[i].getreservation().equals("ST")
                    && studentsQualified[i].getAlloted() != true) {
                sct_vacancies--;
                studentsQualified[i].setAlloted(true);
                alloted[k] = studentsQualified[i];
                numOfvacancies--;
                k++;
            }
        }
    }

    for (i = 0; i < N; i++) {
        if (numOfvacancies > 0
                && studentsQualified[i].getreservation().equals("Open")
                && studentsQualified[i].getAlloted() == false) {
            studentsQualified[i].setAlloted(true);
            alloted[k] = studentsQualified[i];
            numOfvacancies--;
            k++;
        }
    }
    Heap.sort(alloted);
    System.out.println(alloted);
}
}
