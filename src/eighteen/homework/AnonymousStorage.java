package eighteen.homework;

import java.util.*;

public class AnonymousStorage {
    List<AnonymousCommodity> anStorage = new ArrayList<>();
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
        AnonymousCommodity anCommodity = new AnonymousCommodity(name, length, width, weight);

        anStorage.add(anCommodity);

        System.out.println("Added!\n" + anCommodity.toString());
        System.out.println("All products in storage: " + anStorage);
    }

    public void removeCommodity() {
        if (anStorage.isEmpty()){
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

        Iterator<AnonymousCommodity> iterator = anStorage.iterator();

        while (iterator.hasNext()) {
            AnonymousCommodity nextCommodity = iterator.next();

            if (nextCommodity.getNameProduct().equalsIgnoreCase(name) && nextCommodity.getLength() == length
                    && nextCommodity.getWidth() == width && nextCommodity.getWeight() == weight) {
                iterator.remove();
                System.out.println("Your remove: " + nextCommodity.toString());
            }
        }
        System.out.println("All products in storage: " + anStorage);
    }

    public void replaceCommodity() {
        if (anStorage.isEmpty()){
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

        Iterator<AnonymousCommodity> iterator = anStorage.iterator();
        while (iterator.hasNext()) {
            AnonymousCommodity nextCommodity = iterator.next();
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

        AnonymousCommodity commodityNew = new AnonymousCommodity(newName, newLength, newWidth, newWeight);
        anStorage.add(commodityNew);

        System.out.println("The product was successfully replaced by: " + commodityNew.toString() + "!");
        System.out.println("All products in storage: " + anStorage);
    }

    public void sortByName() {
        if (anStorage.isEmpty()){
            System.out.println("The storage is empty! First, add the products.");
            addCommodity();
            addCommodity();
        }

        Collections.sort(anStorage, new Comparator<AnonymousCommodity>() {
            @Override
            public int compare(AnonymousCommodity o1, AnonymousCommodity o2) {
                if (o1.getNameProduct().compareTo(o2.getNameProduct()) > 0) {
                    return 1;
                }
                if (o1.getNameProduct().compareTo(o2.getNameProduct()) < 0) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("After sorting by name: ");
        for (AnonymousCommodity commodity : anStorage) {
            System.out.println(commodity);
        }
    }

    public void sortByLength() {
        if (anStorage.isEmpty()) {
            System.out.println("The storage is empty! First, add the products.");
            addCommodity();
            addCommodity();
        }

        Collections.sort(anStorage, new Comparator<AnonymousCommodity>() {
            @Override
            public int compare(AnonymousCommodity o1, AnonymousCommodity o2) {
                if (o1.getLength() > o2.getLength()) {
                    return 1;
                }
                if (o1.getLength() < o2.getLength()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("After sorting by length: ");
        for (AnonymousCommodity commodity : anStorage) {
            System.out.println(commodity);
        }
    }

    public void sortByWidth() {
        if (anStorage.isEmpty()){
            System.out.println("The storage is empty! First, add the products.");
            addCommodity();
            addCommodity();
        }

        Collections.sort(anStorage, new Comparator<AnonymousCommodity>() {
            @Override
            public int compare(AnonymousCommodity o1, AnonymousCommodity o2) {
                if (o1.getWidth() > o2.getWidth()) {
                    return 1;
                }
                if (o1.getWidth() < o2.getWidth()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("After sorting by width: ");
        for (AnonymousCommodity commodity : anStorage) {
            System.out.println(commodity);
        }
    }

    public void sortByWeight() {
        if (anStorage.isEmpty()){
            System.out.println("The storage is empty! First, add the products.");
            addCommodity();
            addCommodity();
        }

        Collections.sort(anStorage, new Comparator<AnonymousCommodity>() {
            @Override
            public int compare(AnonymousCommodity o1, AnonymousCommodity o2) {
                if (o1.getWeight() > o2.getWeight()) {
                    return 1;
                }
                if (o1.getWeight() < o2.getWeight()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("After sorting by weight: ");
        for (AnonymousCommodity commodity : anStorage) {
            System.out.println(commodity);
        }
    }

    public void getCommodity() {
        System.out.println("Enter the serial number of the product: ");
        int i = scanner.nextInt();

        if (i < 0 || i > (anStorage.size() - 1)) {
            System.out.println("The product with this serial number is not in storage!");
        } else {
            System.out.println("Under serial number " + i + " in storage is " + anStorage.get(i).toString());
        }
    }
}
