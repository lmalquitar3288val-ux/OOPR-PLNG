class Vehicle:

  def __init__(self, brand, daily_rate):
    self.brand = brand
    self.daily_rate = daily_rate

  def calculate_rental(self, days):
    return self.daily_rate * days

  def __str__(self):
    return f"Brand: {self.brand}, Daily Rate: ${self.daily_rate:.2f}"


class Car(Vehicle):

  def __init__(self, brand, daily_rate, seat_capacity):
    super().__init__(brand, daily_rate)
    self.seat_capacity = seat_capacity

  def __str__(self):
    return f"Car -> {super().__str__()}, Seats: {self.seat_capacity}"


class Motorcycle(Vehicle):

  def __init__(self, brand, daily_rate, engine_capacity_cc):
    super().__init__(brand, daily_rate)
    self.engine_capacity_cc = engine_capacity_cc

  def __str__(self):
    return (
        f"Motorcycle -> {super().__str__()}, Engine: {self.engine_capacity_cc}cc"
    )


rental_days = 3

car = Car("Toyota Camry", 50.00, 5)
motorcycle = Motorcycle("Yamaha R1M", 67.00, 998)

print(car)
print(f"Rental Charge for {rental_days} days: ${car.calculate_rental(rental_days):.2f}\n")

print(motorcycle)
print(f"Rental Charge for {rental_days} days: ${motorcycle.calculate_rental(rental_days):.2f}")
