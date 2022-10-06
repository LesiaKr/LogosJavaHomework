package fourteen.homework.commodity;

import java.util.Comparator;

class byNameComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getNameProduct().compareTo(o2.getNameProduct()) > 0) {
            return 1;
        } else if (o1.getNameProduct().compareTo(o2.getNameProduct()) < 0) {
            return -1;
        }
        return 0;
    }
}

class byLengthComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getLength() > o2.getLength()) {
            return 1;
        } else if (o1.getLength() < o2.getLength()) {
            return -1;
        }
        return 0;
    }
}

class byWidthComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getWidth() > o2.getWidth()) {
            return 1;
        } else if (o1.getWidth() < o2.getWidth()) {
            return -1;
        }
        return 0;
    }
}

class byWeightComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        return 0;
    }
}

