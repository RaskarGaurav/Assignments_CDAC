data("mtcars")
attach(mtcars)

#Independent test between mpg and vs

str(mtcars)
mtcars$vs <- as.factor(mtcars$vs)
str(mtcars)
shapiro.test(mpg)
t.test(mpg~vs,data = mtcars)

#Independent test between mpg and am
str(mtcars)
mtcars$vam <- as.factor(mtcars$am)
str(mtcars)
shapiro.test(mpg)
t.test(mpg~am,data = mtcars)
