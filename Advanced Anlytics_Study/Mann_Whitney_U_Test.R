#Man-Whitney U-Test
mann_whitney_U_test <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-13_Chi-Square Test_One Sample Wilcoxon Test_Mann whitney U-test , Wilcoxon Sign Raned Test _Krushkal Wallis Test/mann-whitney U-test.xlsx")
attach(mann_whitney_U_test)
shapiro.test(Mumbai)
shapiro.test(Delhi)

wilcox.test(Mumbai,Delhi,mu=0)
