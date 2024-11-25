#Chi-Squared Test
chi_square <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-13_Chi-Square Test_One Sample Wilcoxon Test_Mann whitney U-test , Wilcoxon Sign Raned Test _Krushkal Wallis Test/Chi-Square Test/chi-square.xlsx")
attach(chi_square)
str(chi_square)
table(grade)
table(code)
tab = table(code,grade)
tab

#chi
chi=chisq.test(tab,correct = TRUE)
chi
chi$expected

#Fisher's Exact test
fisher.test(tab,conf.int = TRUE,conf.level = 0.95)
