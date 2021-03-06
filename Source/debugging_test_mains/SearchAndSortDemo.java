/*
 *
 */
package debugging_test_mains;

import hospital_components.CasualEmployee;
import data_structures.ElementNotFoundException;
import data_structures.LinkedList;
import data_structures.LinkedQueue;
import data_structures.ArrayStack;
import hospital_components.Bed;
import data_structures.EmptyCollectionException;
import hospital_components.Patient;
import io_utils.ReadFile;
import search_sort_utils.SearchUtilities;
import search_sort_utils.SortUtilities;
import io_utils.WriteFile;

/**
 *
 * @author John Verwolf
 */
public class SearchAndSortDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //Demonstrate file Read/Write
//        {
//            //get unsorted list of patients from method
//            ArrayStack<Patient> testFileIOStack = stackOfPatients();
//
//            System.out.println("\nWriting to file");
//            new WriteFile<>(testFileIOStack).writeTo("testStack");
//
//            System.out.println("\nReading from file");
//            ArrayStack<Patient> testInputStack = (ArrayStack<Patient>) new ReadFile<Patient>("testStack").getFile();
//
//            //output unsorted list of patients to screen
//            try {
//                while (!testInputStack.isEmpty()) {
//                    System.out.println(testInputStack.pop().getName());
//                }
//            } catch (EmptyCollectionException e) {
//                System.out.println(e);
//            }
//        }
        //demonstrate linear search        
        {
            String searchFor = "Bob2";  //Priority value of patient to be searched for                 
            System.out.println("\nLinear Search - Search for: " + searchFor);
            try {
                int location = SearchUtilities.linearSearchPatient(searchFor, stackOfPatients());
                location++;      //increment to acount for array index starting at 0
                System.out.println("Location: " + location); //Print name and priority of patient found
            } catch (ElementNotFoundException e) {
                System.out.println(e);
            }

        }
        //demonstrate insertion sort
        {
            System.out.println("\nInsertion Sort Output:");
            //call the search
            ArrayStack<Patient> testSSortStack = SortUtilities.insertionSort(stackOfPatients());
            //print to screen
            try {
                while (!testSSortStack.isEmpty()) {
                    System.out.println(testSSortStack.pop().getName());

                }
            } catch (EmptyCollectionException e) {
                System.out.println(e);
            }
        }
        //demonstrate selection sort
        {
            System.out.println("\nSelection Sort Output:");
            //call the search
            ArrayStack<Patient> testSSortStack = SortUtilities.selectionSort(stackOfPatients());
            //print to screen
            try {
                while (!testSSortStack.isEmpty()) {
                    System.out.println(testSSortStack.pop().getName());

                }
            } catch (EmptyCollectionException e) {
                System.out.println(e);
            }
        }
        //demonstrate binary search 
        {
            int searchFor = 5;  //Priority value of patient to be searched for            
            ArrayStack<Patient> testSSortStack = SortUtilities.insertionSort(stackOfPatients());
            System.out.println("\nBinary Search:");
            try {
                Patient p = SearchUtilities.binarySearch(searchFor, testSSortStack);
                System.out.println(p.getName() + "\t" + p.getPriority()); //Print name and priority of patient found
            } catch (ElementNotFoundException e) {
                System.out.println(e);
            }
        }
        //Test removeAt method in linked list
        {

            LinkedList<Bed> bedList = listOfBeds();
            try {
                Bed testBed = bedList.removeAt(1);
                System.out.println("\ntest removeAt method:" + testBed.getName());
                //LinkedList<Bed> test = bedList.copy();
                while (!bedList.isEmpty()) {
                    System.out.println(bedList.removeFirst().getName());
                }
            } catch (EmptyCollectionException e) {
                System.out.println(e);
            }

        }

        //demonstrate remove()
        {
            //call the search
            ArrayStack<Patient> testSSortStack = SortUtilities.insertionSort(stackOfPatients());

            //print to screen
            try {
                System.out.println("get; " + testSSortStack.get(10).getName());
                System.out.println(testSSortStack.size());
                while (!testSSortStack.isEmpty()) {
                    System.out.println(testSSortStack.pop().getName());

                }
            } catch (EmptyCollectionException e) {
                System.out.println(e);
            }
        }
        //test LinkedQueue
        {

            LinkedQueue<CasualEmployee> firstList = queueOfCasualEmployees();
            LinkedQueue<CasualEmployee> bedList = firstList.copy();
            try {
              
                System.out.println("\ntest linkedQueue:" );
            
                while (!bedList.isEmpty()) {
                    System.out.println(bedList.dequeue().getName());
                }
            } catch (EmptyCollectionException e) {
                System.out.println(e);
            }

        }
    }

    /**
     * Generate and return a stack of beds with 4 beds.
     *
     * @return a stack of beds with 4 beds.
     */
    private static LinkedList<Bed> listOfBeds() {
        LinkedList<Bed> bList = new LinkedList<>();
        bList.addLast(new Bed("Bed1", "1", true, null));
//        bList.addLast(new Bed("Bed2", "1", true, null));
//        bList.addLast(new Bed("Bed3", "1", true, null));
//        bList.addLast(new Bed("Bed4", "1", true, null));
//        bList.addLast(new Bed("Bed5", "1", true, null));
//        bList.addLast(new Bed("Bed6", "1", true, null));
//        bList.addLast(new Bed("Bed7", "1", true, null));

        return bList;
    }

    /**
     * Generate and return a stack of 10 patients.
     *
     * @return a stack of 10 patients.
     */
    private static ArrayStack stackOfPatients() {
        Patient p10 = new Patient("Bob10", 10);
        Patient p9 = new Patient("Bob9", 9);
        Patient p8 = new Patient("Bob8", 8);
        Patient p7 = new Patient("Bob7", 7);
        Patient p6 = new Patient("Bob6", 6);
        Patient p5 = new Patient("Bob5", 5);
        Patient p4 = new Patient("Bob4", 4);
        Patient p3 = new Patient("Bob3", 3);
        Patient p2 = new Patient("Bob2", 2);
        Patient p1 = new Patient("Bob1", 1);

        ArrayStack<Patient> pStack = new ArrayStack<>();

        for (Patient e : new Patient[]{p2, p1, p3, p8, p5, p9, p7, p6, p4, p10}) {
            pStack.push(e);
        }

        return pStack.copy();
    }

    private static LinkedQueue<CasualEmployee> queueOfCasualEmployees() {
        LinkedQueue<CasualEmployee> CEQueue = new LinkedQueue<>();
        
        CEQueue.enqueue(new CasualEmployee("Emp1", true));
        CEQueue.enqueue(new CasualEmployee("Emp2", true));
        CEQueue.enqueue( new CasualEmployee("Emp3", true));

        

        
        return CEQueue;
    }
}
