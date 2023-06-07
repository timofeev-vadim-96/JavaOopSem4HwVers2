# GeekBrains группа № 4334/4336/4338 
## Тимофеев Вадим

## Домашнее задание к 4 семинару по ООП на Java

Все задачи реализованы в соответствии с заданием. Прошу обратить внимание на нижеперечисленные заметки:  

Заметка 1: DataContainer <T имплементируем сырой Comparable>, потому что, класс Warrior не сам является Comparable, а 
является наследником Comparable класса Hero. Честно говоря, был удивлен, что DataContainer <T extends Comparable<T>> 
не работает, получается, в данном случа, только с сырым типом.  

Заметка 2: строка 77 в main не работает как должна почему-то. Из такого положения не могу достучаться к методам  
класса Warrior, а именно к getStamina()...  :  
// строка 77: warriors.sort((war1, war2)-> Integer.compare(war1.getStamina(), war2.getStamina()));  
p.s. При этом, в строке 76 компаратор работает исправно... :  
warriors.sort(Comparator.comparingInt(Warrior::getStamina));  




