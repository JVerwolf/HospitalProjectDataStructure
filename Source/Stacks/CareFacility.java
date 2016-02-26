package Stacks;

import ADT.Company;
import ADT.FullTimeEmployee;
import ADT.HourlyEmployee;

/**
 *
 * @author John Verwolf
 */
public class CareFacility extends Company {

    private java.lang.String facilityName;
    public ArrayStack<Patient> patientStack;
    private ArrayStack<Bed> bedStack;
    private HourlyEmployee[] hourlyEmployee;

    /**
     * Initializes this Care Facility object's name and array of employees,
     * array of beds and array of patients to null
     */
    public CareFacility() {
        facilityName = null;
        hourlyEmployee = new HourlyEmployee[50];
        bedStack = new ArrayStack<>();
        patientStack = new ArrayStack<>();
    }

    /**
     * Initializes this Care Facility object's name and array of employees array
     * of beds and array of patients from a specified name and array of
     * employees, array of beds and array of patients
     *
     * @param facilityName
     * @param patientStack
     * @param bedStack
     * @param hourlyEmployee
     */
    public CareFacility(String facilityName, ArrayStack<Patient> patientStack, ArrayStack<Bed> bedStack, HourlyEmployee[] hourlyEmployee) {
        this.facilityName = facilityName;
        this.patientStack = patientStack;
        this.bedStack = bedStack;
        this.hourlyEmployee = hourlyEmployee;
        sortPatientStack(); //sort data in  passed stack of patients
    }

    /**
     * Initializes this Care Facility object's name and array of employees from
     * specified name and array of employees The array of beds and array of
     * patients will be set to null
     *
     * @param facilityName
     * @param hourlyEmployee
     */
    public CareFacility(String facilityName, HourlyEmployee[] hourlyEmployee) {
        this.facilityName = facilityName;
        this.hourlyEmployee = hourlyEmployee;
        bedStack = new ArrayStack<>();
        patientStack = new ArrayStack<>();
    }

    public void addPatient(Patient p) {
        //System.out.println("\nNEW INSERT"); //uncomment to view algorithm in action
        insert(patientStack, p);
    }

    /**
     * This method will sort the instance object patientStack according to
     * criticallity.
     */
    public void sortPatientStack() {
        sort(patientStack);
    }

    /**
     * This method will sort an ArrayObject of generic type Patient by
     * criticallity. It is an expensive call, likely O(n^2), so use judiciously.
     *
     * @param stack ArrayStack of Patient type to be sorted.
     */
    private void sort(ArrayStack<Patient> stack) {
        try {
            if (stack.isEmpty()) {      //when stack becomes empty, return to right after sort(s); call, before insert(s, t) below.
                return;
            }
            Patient t = stack.pop();    //Peel every element off of stack and store in call-stack
            sort(stack);                //recursive call
            insert(stack, t);           //sort top element of call stack back into stack.
        } catch (EmptyCollectionException e) {
            System.out.println("Something went wrong in Carefacility.sort(s):\t" + e);
        }
    }

    /**
     * This method will insert a patient into a stack in order of criticallity.
     * The patients with the lowest criticallity are placed on the top of the
     * stack because they are most likely to be popped off of the stack, and
     * this will cause less time for the sorting algorithm.
     *
     * @param stack   ArrayStack of Patients in which patient will be inserted
     * @param patient Patient to be inserted
     */
    private void insert(ArrayStack<Patient> stack, Patient patient) {

        try {
            if (stack.isEmpty()) { //if the stack is empty
                stack.push(patient);//push patient on stack
                return;
            }
            if (stack.peek().getPriority() < patient.getPriority()) {   //check if priority of top element on stack is lower
                Patient t = stack.pop();                                //pop top element and store in a temp variable
                insert(stack, patient);             //recursive call. (Do it all again with one less element on the call-stack).    
                stack.push(t);                      //put topElement back on to stack as recursion unwinds
            } else {                                //insert patient when priority is not larger than the top stack element
                stack.push(patient);                //insert patient in proper place on stack
            }
        } catch (EmptyCollectionException e) {
            System.out.println("Something went wrong in Carefacility.insert(s,p):\t" + e);
        }
    }

    /**
     * This class assigns beds (from a stack of Bed objects ) to patients (in a
     * stack of Patient objects). It will recursively call itself till the
     * patient stack is empty, then start assigning beds to the patients with
     * the highest priority which reside at the bottom of the patient stack.
     *
     * @param PatientS A stack of (sorted) Patient objects
     * @param bedS     A stack of Bed objects
     */
    private static void bedTime(ArrayStack<Patient> PatientS, ArrayStack<Bed> bedS) {

        try {
            if (bedS.isEmpty()) {
                return;
            }
            if (!PatientS.isEmpty()) {
                Patient t = PatientS.pop();                     //pop temp element off of the stack
                bedTime(PatientS, bedS);                        //recursive call (ie reverse stack by pushing to call-stack)
                //                                              //recursion unwinds and starts returning to this line
                if (t.getBed() == null && !bedS.isEmpty()) {    //if Patient t does not have a bed and if there are beds available...
                    t.setBed(bedS.pop());                       //pop bed from bed stack and give to Patient 
                }
                PatientS.push(t);                               //put temp element back on to stack as recursion unwinds
            }
        } catch (EmptyCollectionException e) {
            System.out.println("Something went wrong in the .bedTime method:\t" + e);
        }
    }

    /**
     * Assign registered patients to existing beds, without kicking people in
     * beds out.
     */
    public void assignBed() {
        bedTime(patientStack, bedStack);
    }
    
    /**
     * This method is for testing this class.  It should be deleted/commented-out for release.
     * @return patientStack instance var
     */
    public ArrayStack<Patient> forTestGetPatientStack(){
        return patientStack;
    }
}
