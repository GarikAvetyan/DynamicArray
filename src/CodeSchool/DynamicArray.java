package CodeSchool;

public class DynamicArray {
    private String[] array = new String[10];

    //Zangvaci mej avelacnuma element
    public void isAdd(String string) {

        if (array[array.length - 1] == null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = string;
                    break;
                }

            }
        } else if (array[array.length - 1] != null) {
            dynamic(string);
        }

    }

    //Ete zangvacy lcvuma sarquma nuyn zangvaci krknakin ev elementnery lcnuma mejy
    private void dynamic(String string) {
        String[] temp = array;
        this.array = new String[temp.length * 2];

        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = string;
                break;
            }
        }
    }

    //veradarcnuma index-ov elementy
    public String getElement(int index) {
        if (index < array.length && array[index] != null) {
            return array[index];
        }
        return "Does not exist";
    }


    @Override
    //Dynamic zangvacy nerkayacnuma String-ov
    public String toString() {
        String arrayString = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                arrayString += "[" + i + "]" + array[i] + "\n";
            } else if (array[i] == null) {
                break;
            }
        }
        return arrayString;
    }

    //Dynamic zangvacic jnjuma index-ov element
    public void removeElement(int index) {
        if (index < array.length && array[index] != null) {

            for (int i = index; i < array.length; i++) {
                String temp = array[i + 1];
                array[i] = temp;
                if (array[i] == null) {
                    break;
                }
            }

        } else {
            System.out.println("Does not exits");
        }
    }

    //Overloading removeElement method
    //Dynamic zangvacic jnjuma string elementy
    public void removeElement(String string) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                System.out.println("Element not found");
                break;
            }

            if (array[i].equals(string)) {
                removeElement(i);
                break;
            }
        }
    }

    //hashvuma dynamic zangvaci erkarutyuny
    public int sizeOfDynamicArray() {
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                s++;
            } else {
                break;
            }
        }
        return s;
    }
}
