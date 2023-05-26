package org.collections.comparator;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>  {

    @Override
    public int compare(Employee o1, Employee o2) {
        //If both name and address is returning -1
        if(o1.getAddress().getAddress1().compareTo(o2.getAddress().getAddress1()) < 0 &&
                o1.getName().compareTo(o2.getName()) < 0){
            return -1;
        } /*If name comparison return -1 */else if(o1.getName().compareTo(o2.getName()) < 0){
            return -1;
        } /*If address comparison return -1 */else if(o1.getAddress().getAddress1().compareTo(o2.getAddress().getAddress1())<0){
            return -1;
        }/*If none of name and address comparison return -1 */else{
            return 1;
        }
    }
}
