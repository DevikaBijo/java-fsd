var TodoItem = /** @class */ (function () {
    function TodoItem(description, dueDate) {
        this.description = description;
        this.dueDate = dueDate;
        this.completed = false;
    }
    TodoItem.prototype.markAsCompleted = function () {
        this.completed = true;
    };
    return TodoItem;
}());
var TodoList = /** @class */ (function () {
    function TodoList() {
        this.items = [];
    }
    TodoList.prototype.addItem = function (item) {
        this.items.push(item);
    };
    TodoList.prototype.removeItem = function (item) {
        var index = this.items.indexOf(item);
        if (index !== -1) {
            this.items.splice(index, 1);
        }
    };
    TodoList.prototype.getItems = function () {
        return this.items;
    };
    return TodoList;
}());
// Example usage:
var todoList = new TodoList();
// Add items
var item1 = new TodoItem("Buy groceries", new Date("2023-04-01"));
var item2 = new TodoItem("Clean the house", new Date("2023-04-03"));
var item3 = new TodoItem("Pay bills", new Date("2023-04-05"));
todoList.addItem(item1);
todoList.addItem(item2);
todoList.addItem(item3);
// Remove an item
todoList.removeItem(item2);
// Mark an item as completed
item1.markAsCompleted();
// Get all items
var allItems = todoList.getItems();
console.log(allItems);
