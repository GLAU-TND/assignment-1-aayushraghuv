package LinkList;

public interface LinkListADT<E> {
    void add(E item);
    E remove();
    int search(E item);
    // LinkedListDefinitionClass<E> sort(LinkedListDefinitionClass<E> person);
    void print();
}
