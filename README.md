This is first repos to be fully integrated with git. Below is summary of steps for this integration:
in eclipse
	create project pointing to where git project will be created e.g C:\Users\jkigozi\git\Git_Eclips_One
	on Github
		create new repository pointing to C:\Users\jkigozi\git\Git_Eclips_One
			publish repository to server as needed
			on local desktop git shell
				cd C:\Users\jkigozi\git\Git_Eclips_One (git/Git_Eclips_One
					vi README.md
						git init
							git add .
								git push -u origin master		to push to github repository
								in eclipse
									create or import java classes and code as needed
									on local desktop git shell
										git add .
											commit -a -m 'Suitable comments'
											in eclipse
												close eclipse
													on windows, under system, set environment variable HOME = C:\Users\jkigozi\git 
														restart eclipse
															Switch to Git view
																paste link from "view on github"
																	right click on master and select "pull"


