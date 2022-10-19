package core.thirteen_iterator_comparator.commodity;

import java.util.*;

public class Storage {
    List<Commodity> storage = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addCommodity() {
        System.out.println("Enter the product: ");
        String name = scanner.next();
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the weight: ");
        double weight = scanner.nextDouble();
        Commodity commodity = new Commodity(name, length, width, weight);

        storage.add(commodity);

        System.out.println("Added!\n" + commodity.toString());
        System.out.println("All products in storage: " + storage);
    }

    public void removeCommodity() {
        if (storage.isEmpty()){
            System.out.println("The storage is empty! First, add the products.");
            addCommodity();
            addCommodity();
        }
        System.out.println("Enter the product you want to remove: ");
        String name = scanner.next();
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the weight: ");
        double weight = scanner.nextDouble();

        Iterator<Commodity> iterator = storage.iterator();

        while (iterator.hasNext()) {
            Commodity nextCommodity = iterator.next();

            if (nextCommodity.getNameProduct().equalsIgnoreCase(name) && nextCommodity.getLength() == length
                    && nextCommodity.getWidth() == width && nextCommodity.getWeight() == weight) {
                iterator.remove();
                System.out.println("Your remove: " + nextCommodity.toString());
            }
        }
        System.out.println("All products in storage: " + storage);
    }

    public void replaceCommodity() {
        if (storage.isEmpty()){
            System.out.println("The storage is empty! First, add the products.");
            addCommodity();
            addCommodity();
        }
        System.out.println("Enter the product to be replaced: ");
        String name = scanner.next();
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the weight: ");
        double weight = scanner.nextDouble();

        Iterator<Commodity> iterator = storage.iterator();
        while (iterator.hasNext()) {
            Commodity nextCommodity = iterator.next();
            if (nextCommodity.getNameProduct().equalsIgnoreCase(name) && nextCommodity.getLength() == length
                    && nextCommodity.getWidth() == width && nextCommodity.getWeight() == weight) {
                iterator.remove();
            }
        }

        System.out.println("Enter the new product: ");
        String newName = scanner.next();
        System.out.println("Enter the length: ");
        double newLength = scanner.nextDouble();
        System.out.println("Enter the width: ");
        double newWidth = scanner.nextDouble();
        System.out.println("Enter the weight: ");
        double newWeight = scanner.nextDouble();

        Commodity commodityNew = new Commodity(newName, newLength, newWidth, newWeight);
        storage.add(commodityNew);

        System.out.println("The product was successfully replaced by: " + commodityNew.toString() + "!");
        System.out.println("All products in storage: " + storage);
    }

    public void sortByName() {
        if (storage.isEmpty()){
            System.out.println("The storage is empty! First, add the products.");
            addCommodity();
            addCommodity();
        }

        Collections.sort(storage, new ByNameComparator());
        System.out.println("After sorting by name: ");
        for (Commodity commodity : storage) {
            System.out.println(commodity);
        }
    }

    public void sortByLength() {
        if (storage.isEmpty()){
            System.out.println("The storage is empty! First, add the products.");
            addCommodity();
            addCommodity();
        }

        Collections.sort(storage, new ByLengthComparator());
        System.out.println("After sorting by length: ");
        for (Commodity commodity : storage) {
            System.out.println(commodity);
        }
    }

    public void sortByWidth() {
        if (storage.isEmpty()){
            System.out.println("The storage is empty! First, add the products.");
            addCommodity();
            addCommodity();
        }

        Collections.sort(storage, new ByWidthComparator());
        System.out.println("After sorting by width: ");
        for (Commodity commodity : storage) {
            System.out.println(commodity);
        }
    }

    public void sortByWeight() {
        if (storage.isEmpty()){
            System.out.println("The storage is empty! First, add the products.");
            addCommodity();
            addCommodity();
        }

        Collections.sort(storage, new ByWeightComparator());
        System.out.println("After sorting by weight: ");
        for (Commodity commodity : storage) {
            System.out.println(commodity);
        }
    }

    public void getCommodity() {
        System.out.println("Enter the serial number of the product: ");
        int i = scanner.nextInt();

        if (i < 0 || i > (storage.size() - 1)) {
            System.out.println("The product with this serial number is not in storage!");
        } else {
            System.out.println("Under serial number " + i + " in storage is " + storage.get(i).toString());
        }
    }
}
