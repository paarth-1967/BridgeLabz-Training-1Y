package com.logistic_router;

class RouteLinkedList<T extends Checkpoint> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;

    // Add at end
    void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Remove by ID
    boolean removeCheckpoint(String id) {
        if (head == null) return false;

        if (head.data.checkpointId.equals(id)) {
            head = head.next;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.checkpointId.equals(id)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Find checkpoint
    T findCheckpoint(String id) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.checkpointId.equals(id)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // Total Distance
    double computeTotalDistance() {
        double total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.data.distanceFromLast;
            temp = temp.next;
        }
        return total;
    }

    // Total Penalty
    double computeTotalPenalty() {
        double total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    // Consistency Check
    boolean checkCritical() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node temp = head;
        while (temp != null) {
            if (temp.data.getType().equals("DeliveryCheckpoint")) {
                hasDelivery = true;
            }
            if (temp.data.getType().equals("FuelCheckpoint")) {
                hasFuel = true;
            }
            temp = temp.next;
        }

        return hasDelivery && hasFuel;
    }

    // Print Route
    void printRoute() {
        Node temp = head;
        int i = 1;

        while (temp != null) {
            Checkpoint c = temp.data;

            String status = c.isDelayed() ? "Delayed" : "On Time";

            System.out.println(i + ". " + c.getType() + " – " +
                    c.locationName + " – " + status +
                    " – Penalty: " + c.calculatePenalty());

            temp = temp.next;
            i++;
        }
    }
}
