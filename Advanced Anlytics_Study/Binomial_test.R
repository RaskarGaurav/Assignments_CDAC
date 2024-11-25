#Binomial Test
Binomial_test <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-13_Chi-Square Test_One Sample Wilcoxon Test_Mann whitney U-test , Wilcoxon Sign Raned Test _Krushkal Wallis Test/Binomial test.xlsx")
attach(Binomial_test)

k = sum(Binomial_test$Selection==1)
n = length(Binomial_test$Selection)

binom.test(k,n,0.5)

str(Binomial_test)
