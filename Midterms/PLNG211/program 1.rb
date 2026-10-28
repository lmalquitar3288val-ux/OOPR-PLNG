class Book:

    def __init__(self, title, author, price):
      self.title = title
      self.author = author
      self.price = price
  
    def __str__(self):
      return f"Title: {self.title}, Author: {self.author}, Price: ${self.price:.2f}"
  
  
class EBook(Book):  
  
    def __init__(self, title, author, price, file_size_mb):
      super().__init__(title, author, price)
      self.file_size_mb = file_size_mb
  
    def __str__(self):  
      return f"{super().__str__()} | File Size: {self.file_size_mb} MB"
  
  
  
book1 = Book("One Piece", "Eiichiro Oda", 24.99)
ebook1 = EBook("Omniscient Reader's Viewpoint", "singNsong", 23.99, 4.5)
ebook2 = EBook("Eleceed", "Dwayne Estudillo", 13.99, 12.0)
  
print(book1)
print(ebook1)
print(ebook2)
  