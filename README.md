# BandMembers

Write program that handles Band Member objects using a hard code of script that will run through the code to test what the CLI object chooses out of the 3 options to print:
- 1. the entire band
- 2. the band members with a given name
- the band member who plays a given instrument

<pre>
test  in                                     out                                                                    rationale
 1    java asn2/Driver -p                 "Harry Styles, Louis Tomlinson, Zayn Malik, Liam Payne, Niall Horan"  input is appropriate & command prints out entire band
 2    java asn2/Driver -n "Harry Styles"  "Harry Styles on the drums"                                           input is appropriate & command prints out specified band member info
 3    java asn2/Driver -i "piano"         "Louis Tomlinson on the guitar"                                       input is correct & command prints out band member that plays specified instrument
 4    java asn2/Driver -n "Liam Payne"    "Liam Payne on the vocals"					 	input is correct & command prints out specified band member info
</pre>
