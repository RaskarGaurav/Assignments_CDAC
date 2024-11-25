#Wilcoxon Signed Rank Test
Wilcoxon_Sign_Ranked_test_for_paired_sample <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-13_Chi-Square Test_One Sample Wilcoxon Test_Mann whitney U-test , Wilcoxon Sign Raned Test _Krushkal Wallis Test/Wilcoxon Sign Ranked test for paired sample.xlsx")
attach(Wilcoxon_Sign_Ranked_test_for_paired_sample)
shapiro.test(Bef)
shapiro.test(Aft)

wilcox.test(Bef,Aft,paired = TRUE)
