import java.util.List;
class RemoveElements {
    // Метод для удаления всех вхождений элемента из списка
    public static void removeElement(List<Item> list, Item item) {
        // Удаляем все вхождения элемента с одинаковым именем
        list.removeIf(i -> i.getName().equals(item.getName()));
    }
}