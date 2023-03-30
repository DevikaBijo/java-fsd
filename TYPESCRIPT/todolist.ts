class TodoItem {
    public description: string;
    public dueDate: Date;
    public completed: boolean;
  
    constructor(description: string, dueDate: Date) {
      this.description = description;
      this.dueDate = dueDate;
      this.completed = false;
    }
  
    public markAsCompleted(): void {
      this.completed = true;
    }
  }
  
  class TodoList {
    private items: TodoItem[];
  
    constructor() {
      this.items = [];
    }
  
    public addItem(item: TodoItem): void {
      this.items.push(item);
    }
  
    public removeItem(item: TodoItem): void {
      const index = this.items.indexOf(item);
      if (index !== -1) {
        this.items.splice(index, 1);
      }
    }
  
    public getItems(): TodoItem[] {
      return this.items;
    }
  }
  
  // Example usage:
  const todoList = new TodoList();
  
  // Add items
  const item1 = new TodoItem("Buy groceries", new Date("2023-04-01"));
  const item2 = new TodoItem("Clean the house", new Date("2023-04-03"));
  const item3 = new TodoItem("Pay bills", new Date("2023-04-05"));
  todoList.addItem(item1);
  todoList.addItem(item2);
  todoList.addItem(item3);
  
  // Remove an item
  todoList.removeItem(item2);
  
  // Mark an item as completed
  item1.markAsCompleted();
  
  // Get all items
  const allItems = todoList.getItems();
  console.log(allItems);
  