#One Sample Wilcoxon Test
One_sample_Wilcoxon_test <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-13_Chi-Square Test_One Sample Wilcoxon Test_Mann whitney U-test , Wilcoxon Sign Raned Test _Krushkal Wallis Test/One sample Wilcoxon test.xlsx")
attach(One_sample_Wilcoxon_test)
shapiro.test(diameter)

wilcox.test(diameter,mu=35)
