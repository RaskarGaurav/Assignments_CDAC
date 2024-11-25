#LPP
# MIN Z = 3A – 2B
# s.t.	5A + 5B > 25
# 3A < 30
# 6B < 18
# 3A + 9B < 36
# where:  A, B > 0

obj_fun1 <- c(3,-2) 
constraint1 <- matrix(c(5,5,3,0,0,6,3,9),ncol = 2,byrow = TRUE)
contraint1.dir <- c(">=","<=","<=","<=")
rhs1 <- c(25,30,18,36)

library(lpSolve)
sol <- lp("min",obj_fun1,constraint1,contraint1.dir,rhs1,compute.sens = TRUE)
sol
sol$solution
