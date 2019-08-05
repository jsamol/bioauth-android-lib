package pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo.liveness;

import java.util.Arrays;

class LivenessClassifier {
    public static int predict_0(double[] features) {
        int[] classes = new int[2];
        
        if (features[395] <= 138.9815647915863) {
            if (features[1200] <= 2.018640168132298) {
                if (features[977] <= 21.941919415966336) {
                    if (features[779] <= 26.770860264418452) {
                        if (features[1396] <= 7.2294743853061965) {
                            if (features[438] <= 51.909276574082995) {
                                if (features[657] <= 13.276606278598015) {
                                    if (features[631] <= 119.78548277625138) {
                                        if (features[72] <= 10.098406523520405) {
                                            if (features[210] <= 8.2527313082028) {
                                                if (features[44] <= 7.1470891355940855) {
                                                    if (features[1114] <= 19.701900913971684) {
                                                        classes[0] = 0; 
                                                        classes[1] = 9589; 
                                                    } else {
                                                        if (features[830] <= 4.111217785985413) {
                                                            if (features[160] <= 11.301886603055259) {
                                                                classes[0] = 0; 
                                                                classes[1] = 261; 
                                                            } else {
                                                                if (features[62] <= 6.2512262581954765) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 30; 
                                                                } else {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 10; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[1387] <= 4.931022174733069) {
                                                                classes[0] = 0; 
                                                                classes[1] = 46; 
                                                            } else {
                                                                classes[0] = 14; 
                                                                classes[1] = 2; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[389] <= 44.71740934886606) {
                                                        if (features[152] <= 20.972660961623188) {
                                                            classes[0] = 0; 
                                                            classes[1] = 579; 
                                                        } else {
                                                            if (features[8] <= 13.186188512715708) {
                                                                if (features[901] <= 17.22745882205102) {
                                                                    classes[0] = 14; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 25; 
                                                                }
                                                            } else {
                                                                if (features[656] <= 12.808262805092161) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 266; 
                                                                } else {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 23; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (features[153] <= 50.2649046771748) {
                                                            if (features[45] <= 9.214469540412816) {
                                                                classes[0] = 0; 
                                                                classes[1] = 41; 
                                                            } else {
                                                                classes[0] = 28; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            classes[0] = 71; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 14881; 
                                            }
                                        } else {
                                            if (features[616] <= 1.2468842018765849) {
                                                if (features[171] <= 14.007723810446793) {
                                                    if (features[1131] <= 13.381962476597643) {
                                                        if (features[993] <= 3.7175624806131427) {
                                                            if (features[1018] <= 1.6595988071940522) {
                                                                if (features[1414] <= 29.430678382307313) {
                                                                    classes[0] = 22; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 8; 
                                                                    classes[1] = 6; 
                                                                }
                                                            } else {
                                                                classes[0] = 990; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            if (features[1396] <= 5.243455252175278) {
                                                                classes[0] = 0; 
                                                                classes[1] = 37; 
                                                            } else {
                                                                classes[0] = 7; 
                                                                classes[1] = 5; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 524; 
                                                    }
                                                } else {
                                                    if (features[200] <= 5.557119648570107) {
                                                        if (features[976] <= 2.4918738818707853) {
                                                            classes[0] = 0; 
                                                            classes[1] = 30; 
                                                        } else {
                                                            classes[0] = 2; 
                                                            classes[1] = 8; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1182; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 6482; 
                                            }
                                        }
                                    } else {
                                        if (features[1134] <= 45.554193549368) {
                                            classes[0] = 0; 
                                            classes[1] = 604; 
                                        } else {
                                            classes[0] = 345; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    if (features[978] <= 3.820309290715742) {
                                        if (features[1409] <= 22.319281054424806) {
                                            classes[0] = 447; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[630] <= 67.76077712602051) {
                                                classes[0] = 9; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 74; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[78] <= 15.656834406650807) {
                                            if (features[1384] <= 1.5360586526182545) {
                                                if (features[405] <= 10.815618752899184) {
                                                    classes[0] = 2; 
                                                    classes[1] = 8; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 12; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 57; 
                                            }
                                        } else {
                                            if (features[958] <= 5.419356197225337) {
                                                classes[0] = 47; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 23; 
                                                classes[1] = 3; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 730; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[222] <= 14.11710359443978) {
                                if (features[989] <= 5.6948509429037255) {
                                    if (features[966] <= 38.94153093260668) {
                                        if (features[640] <= 223.67131977850462) {
                                            if (features[655] <= 9.719672117616536) {
                                                classes[0] = 0; 
                                                classes[1] = 32; 
                                            } else {
                                                if (features[980] <= 7.932263213877023) {
                                                    classes[0] = 1; 
                                                    classes[1] = 11; 
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 8; 
                                                }
                                            }
                                        } else {
                                            if (features[125] <= 122.01550923297052) {
                                                if (features[342] <= 0.1308786511413995) {
                                                    if (features[399] <= 17.02441473720244) {
                                                        if (features[952] <= 11.457778841842483) {
                                                            if (features[167] <= 3.1105089234432146) {
                                                                if (features[177] <= 2.2513058552398757) {
                                                                    classes[0] = 135; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    if (features[652] <= 21.4103814333521) {
                                                                        classes[0] = 18; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 12; 
                                                                        classes[1] = 1; 
                                                                    }
                                                                }
                                                            } else {
                                                                if (features[372] <= 10.84071809683974) {
                                                                    if (features[769] <= 57.93625886340962) {
                                                                        classes[0] = 1265; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 12; 
                                                                        classes[1] = 1; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 1321; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[924] <= 30.849346974530157) {
                                                                classes[0] = 0; 
                                                                classes[1] = 10; 
                                                            } else {
                                                                classes[0] = 145; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[864] <= 29.20682780589699) {
                                                            if (features[1138] <= 11.721921497200903) {
                                                                if (features[1147] <= 2.992502118865705) {
                                                                    classes[0] = 577; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 12; 
                                                                    classes[1] = 1; 
                                                                }
                                                            } else {
                                                                if (features[43] <= 35.82323421863137) {
                                                                    if (features[1162] <= 0.39963098198692026) {
                                                                        if (features[1020] <= 6.211329867324531) {
                                                                            classes[0] = 8; 
                                                                            classes[1] = 5; 
                                                                        } else {
                                                                            classes[0] = 30; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    } else {
                                                                        classes[0] = 6; 
                                                                        classes[1] = 4; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 121; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 8; 
                                                            classes[1] = 5; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 32; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 15; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 259; 
                                    }
                                } else {
                                    if (features[1105] <= 4.039090194820814) {
                                        if (features[799] <= 7.0823934892075435) {
                                            classes[0] = 0; 
                                            classes[1] = 257; 
                                        } else {
                                            if (features[1122] <= 65.65579705791984) {
                                                classes[0] = 0; 
                                                classes[1] = 32; 
                                            } else {
                                                classes[0] = 641; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 763; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 584; 
                            }
                        }
                    } else {
                        if (features[1426] <= 41.94718794497193) {
                            if (features[245] <= 3.985590441918446) {
                                if (features[1399] <= 2.370502924948382) {
                                    classes[0] = 0; 
                                    classes[1] = 663; 
                                } else {
                                    if (features[862] <= 9.33582577045161) {
                                        if (features[201] <= 21.197032517117584) {
                                            classes[0] = 85; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 14; 
                                        }
                                    } else {
                                        if (features[946] <= 13.850705863216223) {
                                            classes[0] = 1; 
                                            classes[1] = 10; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 40; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 747; 
                            }
                        } else {
                            if (features[230] <= 15.726542489804915) {
                                if (features[86] <= 9.366873844831797) {
                                    if (features[251] <= 43.114578744682085) {
                                        classes[0] = 1; 
                                        classes[1] = 11; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 173; 
                                    }
                                } else {
                                    if (features[770] <= 15.306239937273997) {
                                        classes[0] = 0; 
                                        classes[1] = 140; 
                                    } else {
                                        if (features[1006] <= 13.92832383284812) {
                                            if (features[423] <= 34.28280555277663) {
                                                if (features[956] <= 104.13494607751518) {
                                                    if (features[842] <= 20.553681161902706) {
                                                        if (features[387] <= 202.92702982894141) {
                                                            if (features[1439] <= 22.262187369124565) {
                                                                classes[0] = 656; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[103] <= 39.365925523265176) {
                                                                    classes[0] = 7; 
                                                                    classes[1] = 3; 
                                                                } else {
                                                                    classes[0] = 22; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 3; 
                                                            classes[1] = 8; 
                                                        }
                                                    } else {
                                                        if (features[794] <= 13.891976157772518) {
                                                            if (features[386] <= 82.28771077478059) {
                                                                if (features[33] <= 26.633095664191746) {
                                                                    classes[0] = 12; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    classes[0] = 11; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                classes[0] = 6; 
                                                                classes[1] = 7; 
                                                            }
                                                        } else {
                                                            if (features[915] <= 132.8649245714334) {
                                                                classes[0] = 3233; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[1011] <= 14.185133676518337) {
                                                                    classes[0] = 12; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    classes[0] = 343; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 21; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 14; 
                                            }
                                        } else {
                                            if (features[648] <= 30.21372492368564) {
                                                classes[0] = 0; 
                                                classes[1] = 55; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 15; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[390] <= 67.84698490928649) {
                                    if (features[338] <= 0.19948213991150818) {
                                        classes[0] = 1; 
                                        classes[1] = 16; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 32; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 246; 
                                }
                            }
                        }
                    }
                } else {
                    if (features[950] <= 66.56601257072509) {
                        if (features[806] <= 27.394694334279155) {
                            if (features[1] <= 138.64160057593045) {
                                if (features[390] <= 127.02382287417026) {
                                    if (features[1126] <= 132.1933560572791) {
                                        if (features[969] <= 11.64661465956219) {
                                            if (features[421] <= 24.422530120515454) {
                                                classes[0] = 114; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[881] <= 13.786791193607899) {
                                                    classes[0] = 14; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 16; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 5418; 
                                        }
                                    } else {
                                        classes[0] = 17; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[654] <= 11.638195113906136) {
                                        classes[0] = 0; 
                                        classes[1] = 139; 
                                    } else {
                                        if (features[255] <= 112.45785951838985) {
                                            classes[0] = 0; 
                                            classes[1] = 93; 
                                        } else {
                                            classes[0] = 288; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 4956; 
                            }
                        } else {
                            if (features[1143] <= 13.133225477669471) {
                                if (features[976] <= 57.124301574391396) {
                                    if (features[840] <= 51.71689053316551) {
                                        classes[0] = 0; 
                                        classes[1] = 10; 
                                    } else {
                                        classes[0] = 337; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 44; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 394; 
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 20321; 
                    }
                }
            } else {
                classes[0] = 3770; 
                classes[1] = 0; 
            }
        } else {
            if (features[622] <= 48.18233077060717) {
                if (features[80] <= 21.93795590347288) {
                    classes[0] = 5505; 
                    classes[1] = 0; 
                } else {
                    if (features[927] <= 81.03525248171533) {
                        classes[0] = 8; 
                        classes[1] = 3; 
                    } else {
                        classes[0] = 886; 
                        classes[1] = 0; 
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 170; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_1(double[] features) {
        int[] classes = new int[2];
        
        if (features[1119] <= 15.766116965908063) {
            if (features[1] <= 2.4280844626211002) {
                if (features[881] <= 3.5740382962827986) {
                    classes[0] = 0; 
                    classes[1] = 14; 
                } else {
                    if (features[945] <= 77.36301170147878) {
                        if (features[1434] <= 15.106188761785377) {
                            classes[0] = 17; 
                            classes[1] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 3; 
                        }
                    } else {
                        classes[0] = 5148; 
                        classes[1] = 0; 
                    }
                }
            } else {
                if (features[939] <= 57.016561095954856) {
                    classes[0] = 0; 
                    classes[1] = 1351; 
                } else {
                    if (features[3] <= 73.38281968197015) {
                        if (features[142] <= 78.12159594997809) {
                            if (features[636] <= 93.2894507679827) {
                                if (features[1120] <= 94.19495789096005) {
                                    classes[0] = 149; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 259; 
                                }
                            } else {
                                classes[0] = 1186; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[934] <= 173.91317507823902) {
                                if (features[1412] <= 73.77453065105641) {
                                    if (features[849] <= 37.967905835196355) {
                                        if (features[237] <= 2.2866716419510067) {
                                            classes[0] = 4; 
                                            classes[1] = 8; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 61; 
                                        }
                                    } else {
                                        classes[0] = 4; 
                                        classes[1] = 7; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 235; 
                                }
                            } else {
                                classes[0] = 27; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[234] <= 5.215538923575156) {
                            if (features[1129] <= 22.081544565636158) {
                                classes[0] = 0; 
                                classes[1] = 30; 
                            } else {
                                if (features[1368] <= 0.12123480046220904) {
                                    classes[0] = 4671; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[204] <= 61.9224976131907) {
                                        classes[0] = 21; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 9; 
                                        classes[1] = 2; 
                                    }
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 24; 
                        }
                    }
                }
            }
        } else {
            if (features[388] <= 113.5925866810979) {
                if (features[1443] <= 4.228314757166465) {
                    if (features[408] <= 1.8588984798354462) {
                        if (features[255] <= 81.31321894406608) {
                            classes[0] = 0; 
                            classes[1] = 807; 
                        } else {
                            if (features[866] <= 7.697000344764209) {
                                classes[0] = 460; 
                                classes[1] = 0; 
                            } else {
                                if (features[799] <= 6.912495399861141) {
                                    classes[0] = 21; 
                                    classes[1] = 1; 
                                } else {
                                    classes[0] = 63; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    } else {
                        if (features[100] <= 6.533933720080028) {
                            classes[0] = 0; 
                            classes[1] = 9652; 
                        } else {
                            if (features[848] <= 13.165620557783514) {
                                if (features[638] <= 99.32585930821193) {
                                    if (features[1001] <= 5.018702497230572) {
                                        if (features[206] <= 5.8176866346248906) {
                                            if (features[854] <= 6.225239322790131) {
                                                if (features[633] <= 67.48248596617321) {
                                                    classes[0] = 0; 
                                                    classes[1] = 60; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 9; 
                                                }
                                            } else {
                                                if (features[179] <= 5.341514622828958) {
                                                    classes[0] = 531; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[229] <= 1.8219032871597296) {
                                                        classes[0] = 0; 
                                                        classes[1] = 27; 
                                                    } else {
                                                        classes[0] = 9; 
                                                        classes[1] = 5; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[914] <= 16.39674100949458) {
                                                if (features[158] <= 30.17882731780524) {
                                                    classes[0] = 0; 
                                                    classes[1] = 627; 
                                                } else {
                                                    if (features[1124] <= 132.2996660784471) {
                                                        classes[0] = 3; 
                                                        classes[1] = 10; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 17; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 4; 
                                                classes[1] = 9; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 4961; 
                                    }
                                } else {
                                    if (features[1383] <= 1.3532538959985716) {
                                        if (features[199] <= 9.703148903655144) {
                                            if (features[80] <= 10.711832201294534) {
                                                classes[0] = 0; 
                                                classes[1] = 126; 
                                            } else {
                                                if (features[995] <= 1.3649566919247325) {
                                                    classes[0] = 3; 
                                                    classes[1] = 8; 
                                                } else {
                                                    if (features[1133] <= 6.898728608617945) {
                                                        classes[0] = 62; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 9; 
                                                        classes[1] = 2; 
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1314; 
                                        }
                                    } else {
                                        if (features[253] <= 58.04258435555619) {
                                            if (features[1449] <= 0.05147241130013757) {
                                                if (features[404] <= 16.275134665729773) {
                                                    if (features[1150] <= 7.140968938126985) {
                                                        classes[0] = 1162; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[351] <= 0.2566652217436173) {
                                                            classes[0] = 2; 
                                                            classes[1] = 8; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 12; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[873] <= 11.011264967657654) {
                                                        if (features[955] <= 12.454135414024906) {
                                                            classes[0] = 3; 
                                                            classes[1] = 13; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 16; 
                                                        }
                                                    } else {
                                                        classes[0] = 14; 
                                                        classes[1] = 5; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 53; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 352; 
                                        }
                                    }
                                }
                            } else {
                                if (features[955] <= 18.62145986452472) {
                                    if (features[401] <= 19.73939153896813) {
                                        if (features[113] <= 20.498064356109317) {
                                            if (features[1362] <= 0.013265469076954063) {
                                                classes[0] = 9; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 15; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 10; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        classes[0] = 9; 
                                        classes[1] = 4; 
                                    }
                                } else {
                                    if (features[220] <= 41.9233268777343) {
                                        if (features[1022] <= 139.62816767913762) {
                                            classes[0] = 0; 
                                            classes[1] = 1101; 
                                        } else {
                                            classes[0] = 1; 
                                            classes[1] = 11; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 4028; 
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[153] <= 48.45969004420348) {
                        if (features[670] <= 4.746993548558784) {
                            if (features[255] <= 165.54451472979875) {
                                classes[0] = 0; 
                                classes[1] = 14293; 
                            } else {
                                if (features[1394] <= 9.299654417264067) {
                                    classes[0] = 0; 
                                    classes[1] = 1688; 
                                } else {
                                    if (features[1464] <= 5.729477937479463) {
                                        classes[0] = 0; 
                                        classes[1] = 80; 
                                    } else {
                                        classes[0] = 23; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            if (features[48] <= 12.184487406262562) {
                                classes[0] = 0; 
                                classes[1] = 11; 
                            } else {
                                classes[0] = 2; 
                                classes[1] = 11; 
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 17756; 
                    }
                }
            } else {
                if (features[972] <= 11.622937193695952) {
                    if (features[392] <= 10.834011944354302) {
                        classes[0] = 0; 
                        classes[1] = 251; 
                    } else {
                        if (features[805] <= 4.388629097191979) {
                            if (features[661] <= 1.161037722776219) {
                                if (features[70] <= 11.665208592501969) {
                                    if (features[951] <= 7.156820246769285) {
                                        classes[0] = 3; 
                                        classes[1] = 8; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 243; 
                                    }
                                } else {
                                    if (features[8] <= 13.892912831282068) {
                                        classes[0] = 0; 
                                        classes[1] = 21; 
                                    } else {
                                        classes[0] = 4; 
                                        classes[1] = 7; 
                                    }
                                }
                            } else {
                                if (features[1155] <= 2.6394777368117546) {
                                    if (features[61] <= 10.290925514878408) {
                                        classes[0] = 19; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 12; 
                                        classes[1] = 1; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 28; 
                                }
                            }
                        } else {
                            if (features[639] <= 180.91428561753509) {
                                if (features[1106] <= 2.0791687477516874) {
                                    if (features[654] <= 1.9382139547302677) {
                                        classes[0] = 0; 
                                        classes[1] = 100; 
                                    } else {
                                        if (features[988] <= 0.07257163631335523) {
                                            classes[0] = 0; 
                                            classes[1] = 37; 
                                        } else {
                                            if (features[355] <= 0.11355038349631467) {
                                                if (features[886] <= 15.553270260827924) {
                                                    if (features[947] <= 11.125850501144646) {
                                                        classes[0] = 1836; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1441] <= 2.593368104593702) {
                                                            classes[0] = 0; 
                                                            classes[1] = 10; 
                                                        } else {
                                                            classes[0] = 162; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[13] <= 36.23431935685778) {
                                                        if (features[926] <= 48.881637491322394) {
                                                            if (features[72] <= 21.843794031258547) {
                                                                if (features[633] <= 186.00568632125817) {
                                                                    classes[0] = 937; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    if (features[94] <= 16.715117076708086) {
                                                                        classes[0] = 10; 
                                                                        classes[1] = 1; 
                                                                    } else {
                                                                        classes[0] = 22; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                }
                                                            } else {
                                                                if (features[801] <= 13.020496514204934) {
                                                                    classes[0] = 12; 
                                                                    classes[1] = 2; 
                                                                } else {
                                                                    classes[0] = 65; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 682; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 2634; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                if (features[835] <= 9.106576443547247) {
                                                    classes[0] = 11; 
                                                    classes[1] = 6; 
                                                } else {
                                                    classes[0] = 34; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[674] <= 2.2275071961731903) {
                                        classes[0] = 0; 
                                        classes[1] = 114; 
                                    } else {
                                        classes[0] = 291; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[652] <= 19.696429349765538) {
                                    classes[0] = 0; 
                                    classes[1] = 25; 
                                } else {
                                    classes[0] = 2; 
                                    classes[1] = 8; 
                                }
                            }
                        }
                    }
                } else {
                    if (features[956] <= 31.044173377292353) {
                        if (features[841] <= 31.83359611985933) {
                            if (features[1010] <= 12.404571374199875) {
                                if (features[926] <= 26.854558368851208) {
                                    if (features[828] <= 10.72197601133182) {
                                        if (features[828] <= 6.258627667723743) {
                                            classes[0] = 0; 
                                            classes[1] = 1580; 
                                        } else {
                                            if (features[164] <= 13.37006115384694) {
                                                classes[0] = 1; 
                                                classes[1] = 17; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 485; 
                                            }
                                        }
                                    } else {
                                        if (features[40] <= 27.667194312056438) {
                                            classes[0] = 0; 
                                            classes[1] = 303; 
                                        } else {
                                            classes[0] = 2; 
                                            classes[1] = 15; 
                                        }
                                    }
                                } else {
                                    if (features[1019] <= 0.3625444112759781) {
                                        classes[0] = 0; 
                                        classes[1] = 157; 
                                    } else {
                                        if (features[130] <= 29.127995120173157) {
                                            classes[0] = 547; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 19; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 1041; 
                            }
                        } else {
                            if (features[248] <= 3.886949995031393) {
                                classes[0] = 0; 
                                classes[1] = 14; 
                            } else {
                                classes[0] = 1344; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[104] <= 44.140616352820786) {
                            classes[0] = 0; 
                            classes[1] = 3162; 
                        } else {
                            if (features[377] <= 19.222987934472762) {
                                classes[0] = 0; 
                                classes[1] = 1495; 
                            } else {
                                if (features[209] <= 22.93173429493114) {
                                    if (features[250] <= 9.051771343487864) {
                                        if (features[1016] <= 2.883210179471147) {
                                            classes[0] = 0; 
                                            classes[1] = 331; 
                                        } else {
                                            classes[0] = 17; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 187; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1944; 
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_2(double[] features) {
        int[] classes = new int[2];
        
        if (features[1196] <= 11.005111753215303) {
            if (features[1356] <= 2.6331944743556255) {
                if (features[642] <= 27.5187049916601) {
                    if (features[1117] <= 27.50036790384928) {
                        if (features[157] <= 86.64929172516776) {
                            if (features[955] <= 24.43259793107116) {
                                classes[0] = 0; 
                                classes[1] = 1252; 
                            } else {
                                if (features[569] <= 0.21572172238054704) {
                                    if (features[1443] <= 19.354626334958635) {
                                        if (features[378] <= 0.0769064278011024) {
                                            classes[0] = 681; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 14; 
                                            classes[1] = 2; 
                                        }
                                    } else {
                                        classes[0] = 6; 
                                        classes[1] = 7; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 44; 
                                }
                            }
                        } else {
                            if (features[1488] <= 0.10094525935235946) {
                                if (features[382] <= 6.095312432554539) {
                                    if (features[1164] <= 26.379669100828007) {
                                        classes[0] = 4735; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1417] <= 2.283220253090586) {
                                            classes[0] = 11; 
                                            classes[1] = 4; 
                                        } else {
                                            classes[0] = 155; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 44; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 22; 
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1097; 
                    }
                } else {
                    if (features[1443] <= 0.2837470521262066) {
                        if (features[197] <= 48.39449085163934) {
                            if (features[36] <= 5.7219234474440945) {
                                if (features[57] <= 7.8362636313757505) {
                                    classes[0] = 0; 
                                    classes[1] = 5718; 
                                } else {
                                    if (features[945] <= 11.602498225685881) {
                                        if (features[1152] <= 3.811172261656484) {
                                            classes[0] = 1; 
                                            classes[1] = 9; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 15; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 16; 
                                    }
                                }
                            } else {
                                if (features[69] <= 29.81717914394243) {
                                    if (features[244] <= 12.604750495407178) {
                                        if (features[187] <= 15.905481956499909) {
                                            if (features[994] <= 8.377663630768993) {
                                                if (features[253] <= 62.99924333989053) {
                                                    if (features[1146] <= 3.785286452895875) {
                                                        if (features[638] <= 42.286001257820686) {
                                                            classes[0] = 0; 
                                                            classes[1] = 29; 
                                                        } else {
                                                            if (features[1003] <= 4.996359563807326) {
                                                                if (features[1396] <= 1.377084530041384) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 123; 
                                                                } else {
                                                                    if (features[622] <= 0.5192539903513437) {
                                                                        classes[0] = 3055; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        if (features[879] <= 14.839825229242765) {
                                                                            if (features[192] <= 5.3805433952115935) {
                                                                                if (features[235] <= 3.672804969403301) {
                                                                                    classes[0] = 1501; 
                                                                                    classes[1] = 0; 
                                                                                } else {
                                                                                    if (features[130] <= 16.852426655792524) {
                                                                                        classes[0] = 12; 
                                                                                        classes[1] = 1; 
                                                                                    } else {
                                                                                        classes[0] = 11; 
                                                                                        classes[1] = 0; 
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (features[990] <= 2.6084634363843167) {
                                                                                    classes[0] = 130; 
                                                                                    classes[1] = 0; 
                                                                                } else {
                                                                                    if (features[899] <= 9.155671663738898) {
                                                                                        classes[0] = 5; 
                                                                                        classes[1] = 6; 
                                                                                    } else {
                                                                                        classes[0] = 38; 
                                                                                        classes[1] = 0; 
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (features[988] <= 1.2306856199797396) {
                                                                                classes[0] = 10; 
                                                                                classes[1] = 4; 
                                                                            } else {
                                                                                classes[0] = 32; 
                                                                                classes[1] = 0; 
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 27; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[653] <= 18.06543786104199) {
                                                            if (features[166] <= 21.20849489594334) {
                                                                if (features[75] <= 12.764828023591232) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 348; 
                                                                } else {
                                                                    classes[0] = 9; 
                                                                    classes[1] = 3; 
                                                                }
                                                            } else {
                                                                if (features[162] <= 38.793051741608075) {
                                                                    if (features[998] <= 1.8699633400726234) {
                                                                        classes[0] = 7; 
                                                                        classes[1] = 5; 
                                                                    } else {
                                                                        classes[0] = 11; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 10; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[37] <= 10.979753588338056) {
                                                                if (features[158] <= 36.80100091532424) {
                                                                    if (features[390] <= 80.79850863502871) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 20; 
                                                                    } else {
                                                                        classes[0] = 1; 
                                                                        classes[1] = 9; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 9; 
                                                                    classes[1] = 2; 
                                                                }
                                                            } else {
                                                                classes[0] = 378; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 242; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 856; 
                                            }
                                        } else {
                                            if (features[78] <= 28.845488923735896) {
                                                if (features[255] <= 27.22720575331539) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1398; 
                                                } else {
                                                    if (features[1439] <= 0.22747328987681106) {
                                                        if (features[134] <= 23.57770731655339) {
                                                            if (features[782] <= 18.72057602271575) {
                                                                classes[0] = 12; 
                                                                classes[1] = 4; 
                                                            } else {
                                                                classes[0] = 20; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            classes[0] = 81; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 15; 
                                                    }
                                                }
                                            } else {
                                                if (features[628] <= 115.15933205798231) {
                                                    if (features[1014] <= 2.229302270776796) {
                                                        classes[0] = 2; 
                                                        classes[1] = 9; 
                                                    } else {
                                                        classes[0] = 16; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 70; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 2242; 
                                    }
                                } else {
                                    if (features[206] <= 31.00479048957942) {
                                        if (features[12] <= 33.9711135852158) {
                                            if (features[123] <= 84.00921557436868) {
                                                if (features[1094] <= 0.10477047569871947) {
                                                    if (features[93] <= 51.18515610943109) {
                                                        classes[0] = 456; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[1112] <= 31.214354383428663) {
                                                            classes[0] = 8; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            classes[0] = 37; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 6; 
                                                    classes[1] = 7; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 21; 
                                            }
                                        } else {
                                            if (features[253] <= 17.164270763244698) {
                                                classes[0] = 0; 
                                                classes[1] = 14; 
                                            } else {
                                                if (features[234] <= 10.86804688005151) {
                                                    classes[0] = 3424; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[988] <= 8.354680659077285) {
                                                        classes[0] = 309; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[117] <= 52.98498982412326) {
                                                            classes[0] = 8; 
                                                            classes[1] = 3; 
                                                        } else {
                                                            classes[0] = 15; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 114; 
                                    }
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5596; 
                        }
                    } else {
                        if (features[653] <= 17.68675071263366) {
                            if (features[1420] <= 197.66288712622543) {
                                if (features[631] <= 151.5129605793451) {
                                    if (features[639] <= 162.1085121960608) {
                                        if (features[395] <= 206.13226987104844) {
                                            classes[0] = 0; 
                                            classes[1] = 31533; 
                                        } else {
                                            if (features[142] <= 42.09891608816466) {
                                                classes[0] = 0; 
                                                classes[1] = 14; 
                                            } else {
                                                classes[0] = 75; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 13354; 
                                    }
                                } else {
                                    if (features[1408] <= 20.0702701457427) {
                                        classes[0] = 346; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 257; 
                                    }
                                }
                            } else {
                                if (features[808] <= 51.066082650241526) {
                                    if (features[910] <= 63.70524005755292) {
                                        if (features[1448] <= 4.482732331037645) {
                                            classes[0] = 0; 
                                            classes[1] = 412; 
                                        } else {
                                            if (features[824] <= 5.876536643713171) {
                                                if (features[59] <= 7.01848139980509) {
                                                    classes[0] = 0; 
                                                    classes[1] = 55; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 10; 
                                                }
                                            } else {
                                                if (features[133] <= 50.39892266958364) {
                                                    classes[0] = 569; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 9; 
                                                    classes[1] = 5; 
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1104; 
                                    }
                                } else {
                                    classes[0] = 599; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[580] <= 0.3111057279076079) {
                                if (features[139] <= 85.32536300351359) {
                                    if (features[579] <= 0.03150286498974162) {
                                        if (features[866] <= 56.238751132557155) {
                                            if (features[190] <= 17.37002052034813) {
                                                if (features[598] <= 1.1097874492351407) {
                                                    if (features[831] <= 18.018022557282514) {
                                                        classes[0] = 0; 
                                                        classes[1] = 788; 
                                                    } else {
                                                        if (features[365] <= 1.4015644428185685) {
                                                            if (features[132] <= 42.69401988379926) {
                                                                classes[0] = 14; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 11; 
                                                                classes[1] = 3; 
                                                            }
                                                        } else {
                                                            classes[0] = 13; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[967] <= 5.998260767239674) {
                                                        classes[0] = 92; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 4; 
                                                        classes[1] = 7; 
                                                    }
                                                }
                                            } else {
                                                if (features[975] <= 19.545509826494033) {
                                                    if (features[212] <= 16.839004791951474) {
                                                        if (features[1009] <= 12.748490304331677) {
                                                            if (features[1415] <= 93.20307257303826) {
                                                                classes[0] = 1; 
                                                                classes[1] = 11; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 20; 
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 79; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 243; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1349; 
                                                }
                                            }
                                        } else {
                                            if (features[649] <= 29.98837334314299) {
                                                classes[0] = 16; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 49; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 435; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1840; 
                                }
                            } else {
                                classes[0] = 219; 
                                classes[1] = 0; 
                            }
                        }
                    }
                }
            } else {
                if (features[640] <= 140.02254997099783) {
                    classes[0] = 0; 
                    classes[1] = 80; 
                } else {
                    if (features[858] <= 18.8625092276311) {
                        if (features[180] <= 8.459340273623386) {
                            classes[0] = 24; 
                            classes[1] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 1; 
                        }
                    } else {
                        if (features[657] <= 19.423265091627247) {
                            if (features[201] <= 7.692183376810432) {
                                classes[0] = 10; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 9; 
                                classes[1] = 1; 
                            }
                        } else {
                            classes[0] = 658; 
                            classes[1] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[1003] <= 0.14757271695488913) {
                classes[0] = 3844; 
                classes[1] = 0; 
            } else {
                if (features[575] <= 18.297137113301808) {
                    classes[0] = 185; 
                    classes[1] = 0; 
                } else {
                    if (features[161] <= 138.40979071509628) {
                        classes[0] = 10; 
                        classes[1] = 0; 
                    } else {
                        classes[0] = 10; 
                        classes[1] = 1; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_3(double[] features) {
        int[] classes = new int[2];
        
        if (features[984] <= 43.04743775619532) {
            if (features[1182] <= 17.45501977106779) {
                if (features[61] <= 10.326073726153655) {
                    if (features[931] <= 129.30159298481885) {
                        if (features[633] <= 101.72166712729008) {
                            if (features[434] <= 35.77707286525428) {
                                if (features[797] <= 4.405485013256999) {
                                    if (features[63] <= 7.278303229977101) {
                                        classes[0] = 0; 
                                        classes[1] = 19905; 
                                    } else {
                                        if (features[925] <= 108.34552455615595) {
                                            if (features[415] <= 5.646817775586967) {
                                                if (features[1395] <= 7.506677338729419) {
                                                    if (features[619] <= 2.2836000352290498) {
                                                        if (features[1109] <= 4.069167177409204) {
                                                            classes[0] = 8; 
                                                            classes[1] = 8; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 220; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 163; 
                                                    }
                                                } else {
                                                    classes[0] = 22; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 2612; 
                                            }
                                        } else {
                                            classes[0] = 10; 
                                            classes[1] = 1; 
                                        }
                                    }
                                } else {
                                    if (features[355] <= 0.053039771970934006) {
                                        if (features[207] <= 6.392836423646144) {
                                            if (features[104] <= 17.759639357605277) {
                                                if (features[255] <= 15.29718354125376) {
                                                    classes[0] = 0; 
                                                    classes[1] = 64; 
                                                } else {
                                                    if (features[619] <= 3.7931601540598234) {
                                                        classes[0] = 1092; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 16; 
                                                    }
                                                }
                                            } else {
                                                if (features[55] <= 10.744013576021729) {
                                                    if (features[142] <= 59.00779483865653) {
                                                        classes[0] = 0; 
                                                        classes[1] = 159; 
                                                    } else {
                                                        classes[0] = 5; 
                                                        classes[1] = 10; 
                                                    }
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 9; 
                                                }
                                            }
                                        } else {
                                            if (features[177] <= 160.42232817631856) {
                                                if (features[963] <= 3.3392695474069405) {
                                                    if (features[10] <= 19.82610450683839) {
                                                        classes[0] = 0; 
                                                        classes[1] = 19; 
                                                    } else {
                                                        classes[0] = 180; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    if (features[1151] <= 5.035729082659407) {
                                                        if (features[809] <= 5.41438182140608) {
                                                            if (features[814] <= 3.8140720642726516) {
                                                                classes[0] = 0; 
                                                                classes[1] = 205; 
                                                            } else {
                                                                if (features[1395] <= 3.3240575737583558) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 77; 
                                                                } else {
                                                                    classes[0] = 2; 
                                                                    classes[1] = 8; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[153] <= 39.449971559670246) {
                                                                classes[0] = 0; 
                                                                classes[1] = 43; 
                                                            } else {
                                                                if (features[776] <= 33.78048116631129) {
                                                                    classes[0] = 9; 
                                                                    classes[1] = 2; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 12; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1099; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 39; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[360] <= 0.8431368603400764) {
                                            if (features[1154] <= 0.9993337430994018) {
                                                if (features[154] <= 51.508717116479644) {
                                                    classes[0] = 0; 
                                                    classes[1] = 18; 
                                                } else {
                                                    classes[0] = 14; 
                                                    classes[1] = 5; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 463; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 5631; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 162; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[625] <= 12.946099472358874) {
                                if (features[1008] <= 2.4654195059715263) {
                                    if (features[72] <= 6.552423569744565) {
                                        classes[0] = 0; 
                                        classes[1] = 123; 
                                    } else {
                                        if (features[389] <= 22.770684955734886) {
                                            classes[0] = 1122; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[182] <= 7.681062074172571) {
                                                classes[0] = 263; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[375] <= 5.943636127198581) {
                                                    classes[0] = 44; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 70; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 667; 
                                }
                            } else {
                                if (features[180] <= 8.460598210136988) {
                                    if (features[365] <= 0.035055532787828504) {
                                        classes[0] = 9; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 9; 
                                        classes[1] = 1; 
                                    }
                                } else {
                                    if (features[904] <= 19.196546436005786) {
                                        classes[0] = 0; 
                                        classes[1] = 839; 
                                    } else {
                                        if (features[51] <= 10.780606735454235) {
                                            classes[0] = 3; 
                                            classes[1] = 17; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 60; 
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[119] <= 48.486867536195426) {
                            if (features[63] <= 8.380006858375769) {
                                classes[0] = 11; 
                                classes[1] = 1; 
                            } else {
                                classes[0] = 467; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[1383] <= 4.213174005247667) {
                                classes[0] = 1; 
                                classes[1] = 16; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 17; 
                            }
                        }
                    }
                } else {
                    if (features[150] <= 162.63302662929064) {
                        if (features[972] <= 51.830488865799055) {
                            if (features[383] <= 103.74783050760006) {
                                if (features[995] <= 14.397036169091232) {
                                    if (features[678] <= 1.1399362124957009) {
                                        if (features[1412] <= 59.56986221887669) {
                                            if (features[1391] <= 56.95318821184014) {
                                                if (features[346] <= 0.1890014011525282) {
                                                    if (features[206] <= 39.655644829574186) {
                                                        if (features[1110] <= 12.051003657500775) {
                                                            if (features[245] <= 12.236588633336178) {
                                                                if (features[1119] <= 87.69472582522361) {
                                                                    if (features[411] <= 19.044175957555655) {
                                                                        if (features[1362] <= 0.08157036267553087) {
                                                                            if (features[386] <= 114.62373121437429) {
                                                                                if (features[117] <= 73.54351049190375) {
                                                                                    if (features[924] <= 54.067817031935355) {
                                                                                        if (features[866] <= 13.624013472247556) {
                                                                                            if (features[812] <= 3.794557294109946) {
                                                                                                if (features[901] <= 4.47758861717792) {
                                                                                                    classes[0] = 10; 
                                                                                                    classes[1] = 2; 
                                                                                                } else {
                                                                                                    classes[0] = 13; 
                                                                                                    classes[1] = 3; 
                                                                                                }
                                                                                            } else {
                                                                                                if (features[121] <= 35.20795562546352) {
                                                                                                    if (features[160] <= 30.19912396982622) {
                                                                                                        if (features[992] <= 0.4145039560615808) {
                                                                                                            classes[0] = 0; 
                                                                                                            classes[1] = 13; 
                                                                                                        } else {
                                                                                                            if (features[611] <= 1.5874887373136992) {
                                                                                                                classes[0] = 849; 
                                                                                                                classes[1] = 0; 
                                                                                                            } else {
                                                                                                                if (features[205] <= 16.015956383746982) {
                                                                                                                    classes[0] = 8; 
                                                                                                                    classes[1] = 2; 
                                                                                                                } else {
                                                                                                                    classes[0] = 12; 
                                                                                                                    classes[1] = 0; 
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        classes[0] = 2233; 
                                                                                                        classes[1] = 0; 
                                                                                                    }
                                                                                                } else {
                                                                                                    if (features[1125] <= 14.83049464595263) {
                                                                                                        classes[0] = 13; 
                                                                                                        classes[1] = 7; 
                                                                                                    } else {
                                                                                                        classes[0] = 32; 
                                                                                                        classes[1] = 0; 
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (features[384] <= 25.494562215544118) {
                                                                                                classes[0] = 235; 
                                                                                                classes[1] = 0; 
                                                                                            } else {
                                                                                                if (features[1395] <= 4.4685799779531115) {
                                                                                                    classes[0] = 0; 
                                                                                                    classes[1] = 20; 
                                                                                                } else {
                                                                                                    classes[0] = 65; 
                                                                                                    classes[1] = 0; 
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (features[197] <= 26.174629941264573) {
                                                                                            if (features[413] <= 12.63687601220005) {
                                                                                                if (features[622] <= 10.844918461028207) {
                                                                                                    classes[0] = 2671; 
                                                                                                    classes[1] = 0; 
                                                                                                } else {
                                                                                                    if (features[413] <= 10.382983777236731) {
                                                                                                        classes[0] = 307; 
                                                                                                        classes[1] = 0; 
                                                                                                    } else {
                                                                                                        if (features[614] <= 25.291394451469046) {
                                                                                                            classes[0] = 8; 
                                                                                                            classes[1] = 2; 
                                                                                                        } else {
                                                                                                            classes[0] = 29; 
                                                                                                            classes[1] = 0; 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                classes[0] = 16; 
                                                                                                classes[1] = 2; 
                                                                                            }
                                                                                        } else {
                                                                                            classes[0] = 2758; 
                                                                                            classes[1] = 0; 
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (features[71] <= 36.55141793967258) {
                                                                                        classes[0] = 6; 
                                                                                        classes[1] = 4; 
                                                                                    } else {
                                                                                        classes[0] = 0; 
                                                                                        classes[1] = 17; 
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (features[1005] <= 1.4167219235063744) {
                                                                                    if (features[245] <= 0.7327509431161425) {
                                                                                        classes[0] = 0; 
                                                                                        classes[1] = 21; 
                                                                                    } else {
                                                                                        classes[0] = 11; 
                                                                                        classes[1] = 0; 
                                                                                    }
                                                                                } else {
                                                                                    classes[0] = 47; 
                                                                                    classes[1] = 0; 
                                                                                }
                                                                            }
                                                                        } else {
                                                                            classes[0] = 2; 
                                                                            classes[1] = 9; 
                                                                        }
                                                                    } else {
                                                                        if (features[1462] <= 3.566839581268596) {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 23; 
                                                                        } else {
                                                                            classes[0] = 120; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (features[123] <= 20.106099873480865) {
                                                                        classes[0] = 2; 
                                                                        classes[1] = 9; 
                                                                    } else {
                                                                        classes[0] = 3; 
                                                                        classes[1] = 7; 
                                                                    }
                                                                }
                                                            } else {
                                                                if (features[14] <= 19.363701263940058) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 19; 
                                                                } else {
                                                                    classes[0] = 5; 
                                                                    classes[1] = 6; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[231] <= 1.246184360596056) {
                                                                classes[0] = 0; 
                                                                classes[1] = 285; 
                                                            } else {
                                                                classes[0] = 1; 
                                                                classes[1] = 15; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[20] <= 13.569420160057241) {
                                                            classes[0] = 0; 
                                                            classes[1] = 94; 
                                                        } else {
                                                            classes[0] = 5; 
                                                            classes[1] = 5; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 168; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 214; 
                                            }
                                        } else {
                                            if (features[255] <= 45.152098041626104) {
                                                classes[0] = 0; 
                                                classes[1] = 256; 
                                            } else {
                                                classes[0] = 18; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[179] <= 36.31025235974846) {
                                            if (features[969] <= 14.069839427337895) {
                                                classes[0] = 3; 
                                                classes[1] = 11; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 42; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 148; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1186; 
                                }
                            } else {
                                if (features[70] <= 51.01766343111125) {
                                    if (features[821] <= 14.969718438743769) {
                                        if (features[1117] <= 48.83755657832232) {
                                            if (features[654] <= 7.830474453459971) {
                                                classes[0] = 0; 
                                                classes[1] = 3131; 
                                            } else {
                                                if (features[180] <= 7.4310793395379475) {
                                                    if (features[248] <= 6.590400164395331) {
                                                        classes[0] = 1058; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[56] <= 16.942946018879297) {
                                                            if (features[842] <= 10.499179477924784) {
                                                                classes[0] = 12; 
                                                                classes[1] = 4; 
                                                            } else {
                                                                classes[0] = 51; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            classes[0] = 111; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[1110] <= 6.5961076287860045) {
                                                        if (features[623] <= 6.562127502294968) {
                                                            if (features[936] <= 10.586935590140843) {
                                                                classes[0] = 15; 
                                                                classes[1] = 4; 
                                                            } else {
                                                                classes[0] = 95; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 367; 
                                                        }
                                                    } else {
                                                        if (features[1126] <= 9.694469196750745) {
                                                            if (features[255] <= 113.86570031560518) {
                                                                classes[0] = 0; 
                                                                classes[1] = 440; 
                                                            } else {
                                                                if (features[1013] <= 8.858839731071098) {
                                                                    classes[0] = 76; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 30; 
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 1329; 
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[628] <= 26.14766447215635) {
                                                classes[0] = 0; 
                                                classes[1] = 2100; 
                                            } else {
                                                if (features[873] <= 19.201462342207364) {
                                                    if (features[187] <= 36.668768694045006) {
                                                        if (features[235] <= 5.300668992844497) {
                                                            if (features[1413] <= 36.555494123236) {
                                                                classes[0] = 4; 
                                                                classes[1] = 8; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 84; 
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 509; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 439; 
                                                    }
                                                } else {
                                                    if (features[255] <= 158.59157901141214) {
                                                        classes[0] = 0; 
                                                        classes[1] = 23; 
                                                    } else {
                                                        if (features[189] <= 14.447565376731745) {
                                                            classes[0] = 12; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[802] <= 12.738670979558801) {
                                                                classes[0] = 19; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 5; 
                                                                classes[1] = 5; 
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[38] <= 34.758843207512996) {
                                            if (features[30] <= 34.24956177737702) {
                                                if (features[788] <= 20.762644120450894) {
                                                    classes[0] = 0; 
                                                    classes[1] = 422; 
                                                } else {
                                                    if (features[385] <= 103.38736800906159) {
                                                        classes[0] = 0; 
                                                        classes[1] = 11; 
                                                    } else {
                                                        classes[0] = 4; 
                                                        classes[1] = 9; 
                                                    }
                                                }
                                            } else {
                                                if (features[129] <= 78.76298272387385) {
                                                    classes[0] = 16; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 10; 
                                                }
                                            }
                                        } else {
                                            if (features[642] <= 152.0062787479767) {
                                                if (features[1128] <= 12.655548330471737) {
                                                    classes[0] = 6; 
                                                    classes[1] = 6; 
                                                } else {
                                                    if (features[669] <= 2.5940558865255023) {
                                                        if (features[9] <= 80.87341055330127) {
                                                            if (features[1378] <= 0.07794584958741545) {
                                                                if (features[181] <= 15.844391707773553) {
                                                                    if (features[79] <= 54.32773190210759) {
                                                                        classes[0] = 21; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 13; 
                                                                        classes[1] = 1; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 263; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                classes[0] = 14; 
                                                                classes[1] = 1; 
                                                            }
                                                        } else {
                                                            classes[0] = 15; 
                                                            classes[1] = 2; 
                                                        }
                                                    } else {
                                                        classes[0] = 668; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 160; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1103] <= 9.339870152923373) {
                                        if (features[32] <= 24.047166782273745) {
                                            if (features[948] <= 56.0955767347622) {
                                                if (features[920] <= 53.064247795339135) {
                                                    classes[0] = 0; 
                                                    classes[1] = 10; 
                                                } else {
                                                    classes[0] = 2; 
                                                    classes[1] = 8; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 139; 
                                            }
                                        } else {
                                            if (features[650] <= 21.608420179167563) {
                                                if (features[1398] <= 12.99082817320464) {
                                                    classes[0] = 0; 
                                                    classes[1] = 132; 
                                                } else {
                                                    classes[0] = 58; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[155] <= 105.02505887598348) {
                                                    classes[0] = 3357; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[1013] <= 0.6136163479111072) {
                                                        classes[0] = 0; 
                                                        classes[1] = 21; 
                                                    } else {
                                                        classes[0] = 23; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[380] <= 60.895618258843726) {
                                            classes[0] = 0; 
                                            classes[1] = 229; 
                                        } else {
                                            classes[0] = 11; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[774] <= 91.35103072960538) {
                                if (features[1412] <= 25.45492310961443) {
                                    if (features[1156] <= 11.304049613516208) {
                                        classes[0] = 0; 
                                        classes[1] = 460; 
                                    } else {
                                        classes[0] = 7; 
                                        classes[1] = 5; 
                                    }
                                } else {
                                    if (features[63] <= 48.79127545830999) {
                                        classes[0] = 0; 
                                        classes[1] = 3106; 
                                    } else {
                                        if (features[369] <= 0.4143919090915104) {
                                            classes[0] = 7; 
                                            classes[1] = 3; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 308; 
                                        }
                                    }
                                }
                            } else {
                                if (features[875] <= 42.13189229377979) {
                                    classes[0] = 585; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 16; 
                                    classes[1] = 1; 
                                }
                            }
                        }
                    } else {
                        if (features[809] <= 36.12869745528956) {
                            if (features[1434] <= 9.862423474143739) {
                                if (features[902] <= 52.2383640472255) {
                                    classes[0] = 3; 
                                    classes[1] = 13; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 466; 
                                }
                            } else {
                                if (features[135] <= 66.04295888797613) {
                                    if (features[382] <= 94.74235789484175) {
                                        classes[0] = 1; 
                                        classes[1] = 15; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 31; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 3613; 
                                }
                            }
                        } else {
                            if (features[993] <= 0.13805775782747112) {
                                classes[0] = 0; 
                                classes[1] = 55; 
                            } else {
                                classes[0] = 1; 
                                classes[1] = 24; 
                            }
                        }
                    }
                }
            } else {
                if (features[67] <= 25.74402601421271) {
                    classes[0] = 2977; 
                    classes[1] = 0; 
                } else {
                    classes[0] = 18; 
                    classes[1] = 1; 
                }
            }
        } else {
            classes[0] = 0; 
            classes[1] = 17611; 
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_4(double[] features) {
        int[] classes = new int[2];
        
        if (features[203] <= 69.58422942147293) {
            if (features[1189] <= 7.233131069669017) {
                if (features[806] <= 4.607040442820413) {
                    if (features[622] <= 2.103279207492296) {
                        if (features[971] <= 2.740913574609145) {
                            if (features[807] <= 1.826088571664928) {
                                if (features[101] <= 5.6245693450790535) {
                                    classes[0] = 0; 
                                    classes[1] = 137; 
                                } else {
                                    classes[0] = 1; 
                                    classes[1] = 18; 
                                }
                            } else {
                                if (features[841] <= 4.865462835806074) {
                                    if (features[409] <= 1.4375893500993018) {
                                        classes[0] = 41; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 10; 
                                        classes[1] = 8; 
                                    }
                                } else {
                                    if (features[18] <= 12.037792662841643) {
                                        if (features[109] <= 19.986977332103272) {
                                            if (features[1138] <= 10.443190576897202) {
                                                classes[0] = 835; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[181] <= 5.33385062066305) {
                                                    classes[0] = 17; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[783] <= 6.542318736833832) {
                                                        classes[0] = 13; 
                                                        classes[1] = 1; 
                                                    } else {
                                                        classes[0] = 10; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[857] <= 11.307154805801153) {
                                                classes[0] = 25; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 14; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 15; 
                                        classes[1] = 2; 
                                    }
                                }
                            }
                        } else {
                            if (features[661] <= 5.239030910865258) {
                                if (features[140] <= 26.99477453566232) {
                                    if (features[1394] <= 2.6277294806232616) {
                                        classes[0] = 0; 
                                        classes[1] = 4043; 
                                    } else {
                                        if (features[142] <= 12.943413877646252) {
                                            classes[0] = 0; 
                                            classes[1] = 215; 
                                        } else {
                                            if (features[365] <= 4.859197183165314) {
                                                classes[0] = 129; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 22; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[364] <= 0.7294432112453239) {
                                        if (features[650] <= 18.903366865052888) {
                                            classes[0] = 63; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[774] <= 14.010511081042885) {
                                                classes[0] = 14; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 9; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 8; 
                                        classes[1] = 9; 
                                    }
                                }
                            } else {
                                if (features[881] <= 6.729801271729395) {
                                    classes[0] = 4; 
                                    classes[1] = 9; 
                                } else {
                                    classes[0] = 167; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    } else {
                        if (features[230] <= 4.103577675371747) {
                            if (features[768] <= 91.58841918729206) {
                                if (features[1390] <= 0.8026586020434581) {
                                    if (features[400] <= 8.012579776919665) {
                                        if (features[235] <= 3.106448495750523) {
                                            if (features[54] <= 11.316137415209203) {
                                                if (features[1401] <= 0.27228741259649625) {
                                                    if (features[127] <= 7.436029686218062) {
                                                        classes[0] = 30; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 1037; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    classes[0] = 17; 
                                                    classes[1] = 2; 
                                                }
                                            } else {
                                                classes[0] = 18; 
                                                classes[1] = 4; 
                                            }
                                        } else {
                                            classes[0] = 9; 
                                            classes[1] = 3; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 159; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 419; 
                                }
                            } else {
                                if (features[933] <= 71.34275626692236) {
                                    if (features[104] <= 26.403505392096466) {
                                        if (features[384] <= 185.0485981681141) {
                                            if (features[964] <= 10.27333888991626) {
                                                classes[0] = 4; 
                                                classes[1] = 12; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 372; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 7151; 
                                        }
                                    } else {
                                        if (features[145] <= 52.92604333301673) {
                                            classes[0] = 0; 
                                            classes[1] = 48; 
                                        } else {
                                            if (features[913] <= 36.22885896915381) {
                                                classes[0] = 8; 
                                                classes[1] = 5; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 26; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[626] <= 12.418371209206459) {
                                        if (features[89] <= 16.466135600362048) {
                                            classes[0] = 70; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 9; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        classes[0] = 12; 
                                        classes[1] = 5; 
                                    }
                                }
                            }
                        } else {
                            if (features[135] <= 33.55367071855573) {
                                classes[0] = 0; 
                                classes[1] = 14198; 
                            } else {
                                if (features[178] <= 181.84814704612916) {
                                    if (features[8] <= 2.2845145520320105) {
                                        classes[0] = 0; 
                                        classes[1] = 189; 
                                    } else {
                                        if (features[868] <= 15.78652272452764) {
                                            if (features[402] <= 12.245291259169347) {
                                                classes[0] = 2; 
                                                classes[1] = 10; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 12; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 48; 
                                        }
                                    }
                                } else {
                                    if (features[1007] <= 5.702759698776012) {
                                        classes[0] = 13; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 28; 
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[37] <= 33.790387578933036) {
                        if (features[4] <= 45.255268638863775) {
                            if (features[616] <= 0.5705532951466934) {
                                if (features[984] <= 4.661188285207463) {
                                    if (features[237] <= 7.8752023072326045) {
                                        if (features[1000] <= 0.7631683743376512) {
                                            classes[0] = 0; 
                                            classes[1] = 78; 
                                        } else {
                                            if (features[1097] <= 0.38498403030202044) {
                                                classes[0] = 2969; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 39; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 87; 
                                    }
                                } else {
                                    if (features[64] <= 65.08553922193732) {
                                        if (features[820] <= 25.86778935767203) {
                                            if (features[1130] <= 7.187592509331347) {
                                                if (features[1390] <= 1.3950913315172204) {
                                                    if (features[47] <= 10.58384435278168) {
                                                        if (features[52] <= 9.104040578536722) {
                                                            classes[0] = 0; 
                                                            classes[1] = 284; 
                                                        } else {
                                                            if (features[903] <= 9.42578053472083) {
                                                                classes[0] = 0; 
                                                                classes[1] = 21; 
                                                            } else {
                                                                classes[0] = 1; 
                                                                classes[1] = 10; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 5; 
                                                        classes[1] = 7; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 810; 
                                                }
                                            } else {
                                                if (features[137] <= 35.004409710162406) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3265; 
                                                } else {
                                                    if (features[174] <= 121.71086448842492) {
                                                        if (features[30] <= 21.575607224001352) {
                                                            classes[0] = 0; 
                                                            classes[1] = 206; 
                                                        } else {
                                                            if (features[1381] <= 2.7231149995215342) {
                                                                classes[0] = 2; 
                                                                classes[1] = 8; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 26; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 187; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[1419] <= 115.45789973507655) {
                                                classes[0] = 21; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 124; 
                                            }
                                        }
                                    } else {
                                        if (features[947] <= 68.1757366273718) {
                                            classes[0] = 15; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 8; 
                                            classes[1] = 2; 
                                        }
                                    }
                                }
                            } else {
                                if (features[6] <= 19.655035679134105) {
                                    if (features[1462] <= 20.76292843591627) {
                                        if (features[633] <= 187.80457566856447) {
                                            classes[0] = 0; 
                                            classes[1] = 5890; 
                                        } else {
                                            classes[0] = 14; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 39; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[600] <= 8.884184409658175) {
                                        if (features[778] <= 11.042882191240011) {
                                            if (features[597] <= 1.244274216506359) {
                                                classes[0] = 0; 
                                                classes[1] = 723; 
                                            } else {
                                                classes[0] = 17; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            if (features[1007] <= 10.384501301173136) {
                                                if (features[634] <= 100.23295516457488) {
                                                    classes[0] = 0; 
                                                    classes[1] = 1904; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 10; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1501; 
                                            }
                                        }
                                    } else {
                                        if (features[961] <= 33.513968308669085) {
                                            if (features[382] <= 97.59333862156048) {
                                                if (features[654] <= 10.638636561069418) {
                                                    classes[0] = 19; 
                                                    classes[1] = 5; 
                                                } else {
                                                    classes[0] = 749; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 14; 
                                            }
                                        } else {
                                            if (features[195] <= 25.467366768450646) {
                                                if (features[978] <= 3.075886041337117) {
                                                    classes[0] = 0; 
                                                    classes[1] = 16; 
                                                } else {
                                                    classes[0] = 7; 
                                                    classes[1] = 3; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 200; 
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[1438] <= 25.477404618682577) {
                                if (features[249] <= 18.72724005672686) {
                                    if (features[128] <= 98.05861120824576) {
                                        if (features[204] <= 29.483179727317534) {
                                            if (features[123] <= 75.81542414316407) {
                                                if (features[937] <= 61.48871714307123) {
                                                    if (features[985] <= 5.710406788001164) {
                                                        if (features[877] <= 13.794903154162728) {
                                                            if (features[628] <= 42.38371133596231) {
                                                                if (features[1396] <= 5.582248378429217) {
                                                                    if (features[151] <= 54.06680754198399) {
                                                                        if (features[623] <= 8.598622365797363) {
                                                                            classes[0] = 436; 
                                                                            classes[1] = 0; 
                                                                        } else {
                                                                            classes[0] = 11; 
                                                                            classes[1] = 4; 
                                                                        }
                                                                    } else {
                                                                        classes[0] = 19; 
                                                                        classes[1] = 3; 
                                                                    }
                                                                } else {
                                                                    if (features[1012] <= 1.9407185692192834) {
                                                                        if (features[1432] <= 3.6613088945628207) {
                                                                            classes[0] = 396; 
                                                                            classes[1] = 0; 
                                                                        } else {
                                                                            if (features[1120] <= 255.0000075735786) {
                                                                                if (features[796] <= 6.046987384857141) {
                                                                                    if (features[926] <= 32.52494346783129) {
                                                                                        classes[0] = 12; 
                                                                                        classes[1] = 1; 
                                                                                    } else {
                                                                                        classes[0] = 19; 
                                                                                        classes[1] = 0; 
                                                                                    }
                                                                                } else {
                                                                                    classes[0] = 43; 
                                                                                    classes[1] = 0; 
                                                                                }
                                                                            } else {
                                                                                classes[0] = 9; 
                                                                                classes[1] = 1; 
                                                                            }
                                                                        }
                                                                    } else {
                                                                        classes[0] = 767; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                }
                                                            } else {
                                                                if (features[167] <= 37.72983429787374) {
                                                                    classes[0] = 7; 
                                                                    classes[1] = 4; 
                                                                } else {
                                                                    classes[0] = 17; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[1395] <= 8.505041908940331) {
                                                                classes[0] = 0; 
                                                                classes[1] = 281; 
                                                            } else {
                                                                classes[0] = 369; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[851] <= 23.31063622025943) {
                                                            classes[0] = 0; 
                                                            classes[1] = 528; 
                                                        } else {
                                                            classes[0] = 12; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[1118] <= 9.611544793232726) {
                                                        if (features[936] <= 75.2681377774455) {
                                                            classes[0] = 5; 
                                                            classes[1] = 6; 
                                                        } else {
                                                            if (features[883] <= 29.292645636097397) {
                                                                classes[0] = 3444; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                if (features[207] <= 9.222241234822503) {
                                                                    if (features[75] <= 21.160779604834314) {
                                                                        classes[0] = 68; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 4; 
                                                                        classes[1] = 8; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 755; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (features[925] <= 163.7301900017062) {
                                                            classes[0] = 4; 
                                                            classes[1] = 6; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 11; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (features[621] <= 11.437821058255341) {
                                                    if (features[893] <= 43.20936930996365) {
                                                        classes[0] = 0; 
                                                        classes[1] = 16; 
                                                    } else {
                                                        classes[0] = 6; 
                                                        classes[1] = 6; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 68; 
                                                }
                                            }
                                        } else {
                                            if (features[641] <= 115.80866431441576) {
                                                if (features[917] <= 29.45380603203582) {
                                                    classes[0] = 0; 
                                                    classes[1] = 73; 
                                                } else {
                                                    if (features[1447] <= 24.075923383071537) {
                                                        if (features[419] <= 5.146201669919369) {
                                                            classes[0] = 8; 
                                                            classes[1] = 4; 
                                                        } else {
                                                            classes[0] = 773; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 4; 
                                                        classes[1] = 7; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1200; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1509; 
                                    }
                                } else {
                                    if (features[106] <= 31.147632785835174) {
                                        classes[0] = 0; 
                                        classes[1] = 1821; 
                                    } else {
                                        if (features[856] <= 16.110596255530258) {
                                            classes[0] = 0; 
                                            classes[1] = 12; 
                                        } else {
                                            classes[0] = 3; 
                                            classes[1] = 7; 
                                        }
                                    }
                                }
                            } else {
                                if (features[395] <= 123.63575870338587) {
                                    classes[0] = 0; 
                                    classes[1] = 2248; 
                                } else {
                                    if (features[821] <= 8.57510847580223) {
                                        classes[0] = 2; 
                                        classes[1] = 8; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 75; 
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[214] <= 15.717170433257127) {
                            if (features[222] <= 2.2508060629754127) {
                                if (features[1129] <= 148.5618936999379) {
                                    if (features[830] <= 23.225210793964287) {
                                        if (features[603] <= 12.03037797653301) {
                                            classes[0] = 1; 
                                            classes[1] = 11; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 37; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 439; 
                                    }
                                } else {
                                    classes[0] = 31; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[887] <= 152.758058255733) {
                                    if (features[1460] <= 4.02241288263109) {
                                        if (features[1403] <= 9.613179207834202) {
                                            if (features[1162] <= 1.8404550001477475) {
                                                classes[0] = 89; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 11; 
                                                classes[1] = 3; 
                                            }
                                        } else {
                                            if (features[1447] <= 15.575277557718767) {
                                                classes[0] = 4585; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[854] <= 38.09050836246489) {
                                                    classes[0] = 12; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 328; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 13; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 66; 
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 550; 
                        }
                    }
                }
            } else {
                classes[0] = 3651; 
                classes[1] = 0; 
            }
        } else {
            if (features[815] <= 82.31602062252934) {
                if (features[818] <= 55.46397253400798) {
                    classes[0] = 0; 
                    classes[1] = 17430; 
                } else {
                    if (features[128] <= 79.05584592519395) {
                        if (features[1107] <= 2.3742592228118236) {
                            classes[0] = 5; 
                            classes[1] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 67; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 971; 
                    }
                }
            } else {
                if (features[387] <= 27.059795706726035) {
                    if (features[991] <= 58.49482874963441) {
                        classes[0] = 122; 
                        classes[1] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 69; 
                    }
                } else {
                    if (features[216] <= 89.3026589833189) {
                        if (features[1395] <= 14.856820121821638) {
                            classes[0] = 1; 
                            classes[1] = 11; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 36; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 300; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_5(double[] features) {
        int[] classes = new int[2];
        
        if (features[1186] <= 2.391916932425422) {
            if (features[976] <= 39.92965178609262) {
                if (features[793] <= 7.0845774335576115) {
                    if (features[658] <= 7.190874758994831) {
                        if (features[166] <= 106.61949215104454) {
                            if (features[1450] <= 1.1839103871320944) {
                                if (features[14] <= 14.446183562684404) {
                                    if (features[1125] <= 35.807586532157096) {
                                        if (features[974] <= 7.152786556196746) {
                                            if (features[88] <= 6.468118148774329) {
                                                classes[0] = 0; 
                                                classes[1] = 5021; 
                                            } else {
                                                if (features[1157] <= 1.8820241436086727) {
                                                    if (features[70] <= 9.95418438460523) {
                                                        if (features[11] <= 12.064895499596576) {
                                                            classes[0] = 0; 
                                                            classes[1] = 177; 
                                                        } else {
                                                            classes[0] = 13; 
                                                            classes[1] = 8; 
                                                        }
                                                    } else {
                                                        if (features[375] <= 19.30686602312118) {
                                                            if (features[29] <= 7.5623116910529635) {
                                                                classes[0] = 0; 
                                                                classes[1] = 17; 
                                                            } else {
                                                                classes[0] = 1; 
                                                                classes[1] = 19; 
                                                            }
                                                        } else {
                                                            if (features[1439] <= 0.025113038457116734) {
                                                                classes[0] = 145; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 25; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 340; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 6010; 
                                        }
                                    } else {
                                        if (features[813] <= 5.244206242114389) {
                                            if (features[978] <= 4.714351313262604) {
                                                if (features[1017] <= 3.9111205845289376) {
                                                    if (features[248] <= 0.3560314751046283) {
                                                        classes[0] = 0; 
                                                        classes[1] = 90; 
                                                    } else {
                                                        classes[0] = 4; 
                                                        classes[1] = 10; 
                                                    }
                                                } else {
                                                    classes[0] = 17; 
                                                    classes[1] = 1; 
                                                }
                                            } else {
                                                if (features[965] <= 15.873016680721777) {
                                                    if (features[168] <= 5.912231287970014) {
                                                        if (features[994] <= 3.3906466037495924) {
                                                            classes[0] = 8; 
                                                            classes[1] = 6; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 17; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 1480; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 1423; 
                                                }
                                            }
                                        } else {
                                            if (features[997] <= 7.121203026908895) {
                                                if (features[653] <= 14.1991628825503) {
                                                    classes[0] = 0; 
                                                    classes[1] = 27; 
                                                } else {
                                                    if (features[637] <= 60.68148746920374) {
                                                        classes[0] = 537; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[819] <= 8.133467748248224) {
                                                            if (features[1433] <= 14.932381666929617) {
                                                                classes[0] = 7; 
                                                                classes[1] = 4; 
                                                            } else {
                                                                if (features[124] <= 20.122087769832994) {
                                                                    classes[0] = 14; 
                                                                    classes[1] = 1; 
                                                                } else {
                                                                    classes[0] = 13; 
                                                                    classes[1] = 1; 
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 130; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 135; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[214] <= 6.783803600285071) {
                                        if (features[654] <= 10.338257405091229) {
                                            classes[0] = 0; 
                                            classes[1] = 213; 
                                        } else {
                                            if (features[1116] <= 45.73618253964569) {
                                                if (features[153] <= 32.58334665205034) {
                                                    if (features[141] <= 42.30536450126494) {
                                                        classes[0] = 9; 
                                                        classes[1] = 6; 
                                                    } else {
                                                        classes[0] = 19; 
                                                        classes[1] = 0; 
                                                    }
                                                } else {
                                                    if (features[1405] <= 10.856919074250477) {
                                                        classes[0] = 621; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[53] <= 11.490356107026077) {
                                                            classes[0] = 11; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 8; 
                                                            classes[1] = 2; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 32; 
                                            }
                                        }
                                    } else {
                                        if (features[156] <= 49.82663474534992) {
                                            classes[0] = 0; 
                                            classes[1] = 2171; 
                                        } else {
                                            if (features[915] <= 13.966721998278548) {
                                                classes[0] = 95; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 16; 
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[904] <= 48.37841710712974) {
                                    if (features[1120] <= 101.8786346334174) {
                                        if (features[20] <= 4.297446454065323) {
                                            classes[0] = 12; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 20; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[831] <= 8.274434302148368) {
                                            classes[0] = 0; 
                                            classes[1] = 12843; 
                                        } else {
                                            if (features[833] <= 12.132018901873256) {
                                                if (features[819] <= 8.756941420391954) {
                                                    classes[0] = 0; 
                                                    classes[1] = 213; 
                                                } else {
                                                    classes[0] = 1; 
                                                    classes[1] = 23; 
                                                }
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 17; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[891] <= 69.2663564881732) {
                                        if (features[1130] <= 133.5409305204489) {
                                            classes[0] = 0; 
                                            classes[1] = 76; 
                                        } else {
                                            classes[0] = 19; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 579; 
                                    }
                                }
                            }
                        } else {
                            if (features[844] <= 11.820978202211545) {
                                if (features[115] <= 47.85621671977332) {
                                    if (features[159] <= 75.37951109567545) {
                                        classes[0] = 0; 
                                        classes[1] = 42; 
                                    } else {
                                        if (features[984] <= 18.08218742990011) {
                                            if (features[1175] <= 3.883484957079791) {
                                                if (features[904] <= 28.64641184436954) {
                                                    if (features[871] <= 7.153841772592188) {
                                                        if (features[71] <= 10.832049619846195) {
                                                            classes[0] = 4; 
                                                            classes[1] = 7; 
                                                        } else {
                                                            classes[0] = 10; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        if (features[188] <= 57.24991691482684) {
                                                            if (features[892] <= 20.950645048867326) {
                                                                if (features[878] <= 14.192995268935869) {
                                                                    classes[0] = 330; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    if (features[236] <= 0.07163889187533244) {
                                                                        if (features[221] <= 0.7803018872222726) {
                                                                            classes[0] = 10; 
                                                                            classes[1] = 1; 
                                                                        } else {
                                                                            classes[0] = 11; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    } else {
                                                                        classes[0] = 28; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                }
                                                            } else {
                                                                if (features[389] <= 9.677765809504635) {
                                                                    classes[0] = 14; 
                                                                    classes[1] = 2; 
                                                                } else {
                                                                    classes[0] = 27; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 5; 
                                                            classes[1] = 5; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[26] <= 12.055942530414658) {
                                                        classes[0] = 1153; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        if (features[5] <= 103.05357905552032) {
                                                            classes[0] = 12; 
                                                            classes[1] = 2; 
                                                        } else {
                                                            classes[0] = 13; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 13; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 34; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 346; 
                                }
                            } else {
                                if (features[254] <= 4.4835056115505445) {
                                    if (features[95] <= 26.109317269810536) {
                                        classes[0] = 5; 
                                        classes[1] = 8; 
                                    } else {
                                        if (features[1417] <= 72.62178515648552) {
                                            if (features[81] <= 28.25091309025748) {
                                                classes[0] = 3; 
                                                classes[1] = 10; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 176; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 821; 
                                        }
                                    }
                                } else {
                                    classes[0] = 27; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    } else {
                        if (features[1422] <= 37.690206271759045) {
                            if (features[412] <= 2.4399897878580883) {
                                classes[0] = 20; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 1449; 
                            }
                        } else {
                            if (features[955] <= 4.164719457689593) {
                                classes[0] = 1978; 
                                classes[1] = 0; 
                            } else {
                                if (features[1108] <= 4.517422944005332) {
                                    if (features[670] <= 0.6150589489621634) {
                                        if (features[428] <= 0.0014032470911708333) {
                                            classes[0] = 1250; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 20; 
                                        }
                                    } else {
                                        if (features[21] <= 12.523778538482494) {
                                            if (features[949] <= 142.48066894346138) {
                                                if (features[615] <= 2.451117455000561) {
                                                    classes[0] = 1; 
                                                    classes[1] = 9; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 13; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 38; 
                                            }
                                        } else {
                                            classes[0] = 22; 
                                            classes[1] = 8; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1060; 
                                }
                            }
                        }
                    }
                } else {
                    if (features[28] <= 43.50603842563633) {
                        if (features[1120] <= 214.03262693690442) {
                            if (features[73] <= 29.126981318309625) {
                                if (features[962] <= 103.47721815848266) {
                                    if (features[364] <= 19.203668338294445) {
                                        if (features[1106] <= 1.9858313585320642) {
                                            if (features[138] <= 88.7920229761393) {
                                                if (features[1137] <= 5.67684664035704) {
                                                    if (features[917] <= 37.051405678712335) {
                                                        if (features[836] <= 10.772009370972206) {
                                                            classes[0] = 114; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            classes[0] = 8; 
                                                            classes[1] = 4; 
                                                        }
                                                    } else {
                                                        if (features[1] <= 188.67988713116247) {
                                                            classes[0] = 3826; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[177] <= 127.50816038262026) {
                                                                classes[0] = 120; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 9; 
                                                                classes[1] = 1; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[11] <= 38.849709075220105) {
                                                        classes[0] = 0; 
                                                        classes[1] = 14; 
                                                    } else {
                                                        classes[0] = 24; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                if (features[1408] <= 2.832244248536291) {
                                                    classes[0] = 4; 
                                                    classes[1] = 6; 
                                                } else {
                                                    if (features[959] <= 110.98464544751675) {
                                                        classes[0] = 2; 
                                                        classes[1] = 13; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 77; 
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 99; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 196; 
                                    }
                                } else {
                                    if (features[121] <= 45.11136110702839) {
                                        if (features[192] <= 128.69332867815865) {
                                            classes[0] = 2; 
                                            classes[1] = 8; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 11; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 347; 
                                    }
                                }
                            } else {
                                if (features[66] <= 69.43140090636264) {
                                    if (features[1154] <= 1.3764568536369628) {
                                        classes[0] = 1; 
                                        classes[1] = 13; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 425; 
                                    }
                                } else {
                                    if (features[241] <= 0.3202462018779417) {
                                        classes[0] = 0; 
                                        classes[1] = 23; 
                                    } else {
                                        classes[0] = 21; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            if (features[846] <= 43.11584644982441) {
                                if (features[1097] <= 0.3831447848876263) {
                                    if (features[929] <= 135.62618335819653) {
                                        if (features[616] <= 13.086428499078282) {
                                            if (features[839] <= 16.791434645580676) {
                                                if (features[1459] <= 12.665473236888216) {
                                                    if (features[593] <= 7.428791965827168) {
                                                        if (features[412] <= 12.051771259199406) {
                                                            if (features[652] <= 24.637399712294123) {
                                                                if (features[185] <= 16.71501497246639) {
                                                                    if (features[230] <= 3.2826767228352196) {
                                                                        if (features[656] <= 8.320966673292292) {
                                                                            if (features[413] <= 1.3639258507930867) {
                                                                                classes[0] = 4; 
                                                                                classes[1] = 8; 
                                                                            } else {
                                                                                classes[0] = 0; 
                                                                                classes[1] = 34; 
                                                                            }
                                                                        } else {
                                                                            classes[0] = 26; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    } else {
                                                                        if (features[196] <= 8.354263437015856) {
                                                                            if (features[116] <= 12.87995433492284) {
                                                                                classes[0] = 0; 
                                                                                classes[1] = 219; 
                                                                            } else {
                                                                                classes[0] = 11; 
                                                                                classes[1] = 0; 
                                                                            }
                                                                        } else {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 291; 
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (features[181] <= 22.63838432676907) {
                                                                        if (features[775] <= 13.255717566954546) {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 112; 
                                                                        } else {
                                                                            classes[0] = 2; 
                                                                            classes[1] = 15; 
                                                                        }
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 345; 
                                                                    }
                                                                }
                                                            } else {
                                                                if (features[188] <= 17.734571346808696) {
                                                                    if (features[370] <= 8.054118158019964) {
                                                                        classes[0] = 128; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        if (features[838] <= 9.169797504520686) {
                                                                            classes[0] = 16; 
                                                                            classes[1] = 2; 
                                                                        } else {
                                                                            if (features[1432] <= 57.00370954110821) {
                                                                                classes[0] = 13; 
                                                                                classes[1] = 1; 
                                                                            } else {
                                                                                classes[0] = 60; 
                                                                                classes[1] = 0; 
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (features[1146] <= 5.321543449571724) {
                                                                        classes[0] = 4; 
                                                                        classes[1] = 8; 
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 56; 
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (features[633] <= 86.62190783155069) {
                                                                classes[0] = 0; 
                                                                classes[1] = 1001; 
                                                            } else {
                                                                if (features[938] <= 11.254671483196333) {
                                                                    classes[0] = 69; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 165; 
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (features[1431] <= 13.61505236144157) {
                                                            classes[0] = 8; 
                                                            classes[1] = 3; 
                                                        } else {
                                                            classes[0] = 249; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[127] <= 44.430879498355765) {
                                                        classes[0] = 491; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 141; 
                                                    }
                                                }
                                            } else {
                                                if (features[254] <= 49.68185734122891) {
                                                    classes[0] = 0; 
                                                    classes[1] = 545; 
                                                } else {
                                                    classes[0] = 973; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 2166; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 1156; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 3995; 
                                }
                            } else {
                                if (features[1440] <= 13.584132997515196) {
                                    if (features[142] <= 101.91944916372411) {
                                        if (features[830] <= 47.64751776664258) {
                                            if (features[948] <= 31.714401556467042) {
                                                classes[0] = 298; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[654] <= 35.86002336440816) {
                                                    classes[0] = 10; 
                                                    classes[1] = 1; 
                                                } else {
                                                    classes[0] = 14; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 805; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[1366] <= 1.5112523193961593) {
                                            classes[0] = 0; 
                                            classes[1] = 224; 
                                        } else {
                                            classes[0] = 16; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 365; 
                                }
                            }
                        }
                    } else {
                        if (features[1398] <= 7.971117690196146) {
                            if (features[1132] <= 71.86598865826446) {
                                if (features[110] <= 125.3935249914935) {
                                    classes[0] = 1; 
                                    classes[1] = 13; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 106; 
                                }
                            } else {
                                classes[0] = 20; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[992] <= 41.735314517450085) {
                                if (features[183] <= 45.67993408621778) {
                                    classes[0] = 2951; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1424] <= 89.57873270770352) {
                                        if (features[390] <= 51.583062903166436) {
                                            if (features[914] <= 61.23738776193224) {
                                                classes[0] = 15; 
                                                classes[1] = 3; 
                                            } else {
                                                classes[0] = 88; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 411; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[655] <= 26.738482680966026) {
                                            classes[0] = 11; 
                                            classes[1] = 3; 
                                        } else {
                                            classes[0] = 11; 
                                            classes[1] = 1; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 11; 
                            }
                        }
                    }
                }
            } else {
                if (features[815] <= 51.263398909232606) {
                    if (features[1119] <= 37.881008929416836) {
                        if (features[81] <= 24.924059100996516) {
                            if (features[768] <= 248.64327185078957) {
                                if (features[1420] <= 137.12491495671884) {
                                    if (features[630] <= 124.44599376993875) {
                                        classes[0] = 2; 
                                        classes[1] = 8; 
                                    } else {
                                        classes[0] = 18; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 140; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[890] <= 22.380832857572383) {
                                    classes[0] = 0; 
                                    classes[1] = 914; 
                                } else {
                                    if (features[640] <= 191.06120160701192) {
                                        if (features[218] <= 71.83603637068987) {
                                            classes[0] = 8; 
                                            classes[1] = 4; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 31; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 69; 
                                    }
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 638; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 19885; 
                    }
                } else {
                    if (features[636] <= 234.9879079062459) {
                        if (features[828] <= 81.60734804722341) {
                            classes[0] = 0; 
                            classes[1] = 1308; 
                        } else {
                            if (features[378] <= 106.08686115430956) {
                                if (features[847] <= 65.91536785433539) {
                                    classes[0] = 1; 
                                    classes[1] = 21; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 62; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 232; 
                            }
                        }
                    } else {
                        if (features[223] <= 92.09307522127193) {
                            classes[0] = 367; 
                            classes[1] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 29; 
                        }
                    }
                }
            }
        } else {
            if (features[65] <= 25.658035558585695) {
                if (features[623] <= 4.122844134734126) {
                    classes[0] = 4481; 
                    classes[1] = 0; 
                } else {
                    classes[0] = 9; 
                    classes[1] = 1; 
                }
            } else {
                classes[0] = 10; 
                classes[1] = 1; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_6(double[] features) {
        int[] classes = new int[2];
        
        if (features[637] <= 95.26146951436361) {
            if (features[457] <= 0.1279210803565145) {
                if (features[243] <= 4.945653791488641) {
                    if (features[905] <= 63.205026046482274) {
                        if (features[935] <= 99.28089146365846) {
                            if (features[135] <= 26.81331002996314) {
                                if (features[147] <= 42.53138624914866) {
                                    if (features[89] <= 6.129355209581635) {
                                        classes[0] = 0; 
                                        classes[1] = 6744; 
                                    } else {
                                        if (features[391] <= 97.21565972372517) {
                                            if (features[995] <= 6.499754984559075) {
                                                if (features[1446] <= 13.097578145042686) {
                                                    if (features[1396] <= 2.628625432739594) {
                                                        classes[0] = 0; 
                                                        classes[1] = 1645; 
                                                    } else {
                                                        if (features[363] <= 1.6450472723699847) {
                                                            if (features[380] <= 89.99027986700558) {
                                                                if (features[1407] <= 21.855558221909714) {
                                                                    if (features[247] <= 1.366038659055589) {
                                                                        if (features[1102] <= 0.027302459786532875) {
                                                                            if (features[1145] <= 2.9555094075249846) {
                                                                                classes[0] = 15; 
                                                                                classes[1] = 0; 
                                                                            } else {
                                                                                classes[0] = 10; 
                                                                                classes[1] = 1; 
                                                                            }
                                                                        } else {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 18; 
                                                                        }
                                                                    } else {
                                                                        if (features[388] <= 83.26855888639892) {
                                                                            classes[0] = 8; 
                                                                            classes[1] = 3; 
                                                                        } else {
                                                                            classes[0] = 1977; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    }
                                                                } else {
                                                                    classes[0] = 12; 
                                                                    classes[1] = 5; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 25; 
                                                            }
                                                        } else {
                                                            if (features[31] <= 8.174912205700434) {
                                                                classes[0] = 0; 
                                                                classes[1] = 176; 
                                                            } else {
                                                                if (features[140] <= 12.39960160796915) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 30; 
                                                                } else {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 10; 
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 426; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 3194; 
                                            }
                                        } else {
                                            if (features[655] <= 5.380011463775941) {
                                                classes[0] = 0; 
                                                classes[1] = 18; 
                                            } else {
                                                classes[0] = 757; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[432] <= 0.7845702841283093) {
                                        if (features[1442] <= 1.5284489048585423) {
                                            classes[0] = 537; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 176; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 194; 
                                    }
                                }
                            } else {
                                if (features[813] <= 29.30797029851891) {
                                    if (features[959] <= 70.45188488120294) {
                                        if (features[921] <= 114.11692994618768) {
                                            if (features[796] <= 11.270782052787675) {
                                                if (features[1424] <= 254.55476026198843) {
                                                    if (features[769] <= 185.3061409305959) {
                                                        if (features[3] <= 50.41229215745891) {
                                                            classes[0] = 0; 
                                                            classes[1] = 2508; 
                                                        } else {
                                                            if (features[183] <= 37.034021727859624) {
                                                                if (features[782] <= 8.471573493654388) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 173; 
                                                                } else {
                                                                    if (features[219] <= 3.5228512529809284) {
                                                                        if (features[1141] <= 7.403663047696239) {
                                                                            classes[0] = 1; 
                                                                            classes[1] = 15; 
                                                                        } else {
                                                                            classes[0] = 2; 
                                                                            classes[1] = 8; 
                                                                        }
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 53; 
                                                                    }
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 1460; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[395] <= 153.9584938626847) {
                                                            classes[0] = 0; 
                                                            classes[1] = 49; 
                                                        } else {
                                                            classes[0] = 19; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 17; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[769] <= 53.78521504848438) {
                                                    if (features[417] <= 6.172267986824277) {
                                                        classes[0] = 19; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 22; 
                                                    }
                                                } else {
                                                    if (features[634] <= 80.2064834265428) {
                                                        classes[0] = 0; 
                                                        classes[1] = 285; 
                                                    } else {
                                                        classes[0] = 17; 
                                                        classes[1] = 2; 
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 12; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 3117; 
                                    }
                                } else {
                                    if (features[1004] <= 30.376658732793185) {
                                        classes[0] = 92; 
                                        classes[1] = 0; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 50; 
                                    }
                                }
                            }
                        } else {
                            if (features[379] <= 41.050481351965146) {
                                if (features[199] <= 61.60713808638497) {
                                    if (features[1117] <= 4.542447048238804) {
                                        if (features[858] <= 6.580220684105089) {
                                            if (features[166] <= 149.77399361383067) {
                                                if (features[791] <= 6.473028436867044) {
                                                    classes[0] = 16; 
                                                    classes[1] = 2; 
                                                } else {
                                                    classes[0] = 18; 
                                                    classes[1] = 0; 
                                                }
                                            } else {
                                                if (features[66] <= 10.624943932490092) {
                                                    if (features[1158] <= 3.8986457268365284) {
                                                        classes[0] = 33; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 13; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    classes[0] = 109; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 3068; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 129; 
                                    }
                                } else {
                                    if (features[383] <= 4.219820833054855) {
                                        classes[0] = 11; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 548; 
                                    }
                                }
                            } else {
                                if (features[43] <= 38.68966132582617) {
                                    classes[0] = 0; 
                                    classes[1] = 1116; 
                                } else {
                                    classes[0] = 246; 
                                    classes[1] = 0; 
                                }
                            }
                        }
                    } else {
                        if (features[180] <= 112.28451956578743) {
                            if (features[1020] <= 24.48517014050835) {
                                if (features[632] <= 128.72415733464257) {
                                    classes[0] = 0; 
                                    classes[1] = 2539; 
                                } else {
                                    classes[0] = 20; 
                                    classes[1] = 5; 
                                }
                            } else {
                                classes[0] = 17; 
                                classes[1] = 0; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5678; 
                        }
                    }
                } else {
                    if (features[93] <= 31.63592102440654) {
                        if (features[989] <= 3.756041600057809) {
                            if (features[648] <= 31.81845821014369) {
                                classes[0] = 0; 
                                classes[1] = 315; 
                            } else {
                                classes[0] = 3; 
                                classes[1] = 7; 
                            }
                        } else {
                            if (features[72] <= 15.886210834556948) {
                                classes[0] = 0; 
                                classes[1] = 18577; 
                            } else {
                                if (features[953] <= 13.816476051685132) {
                                    if (features[890] <= 12.364760429002084) {
                                        if (features[1433] <= 10.328853554793564) {
                                            if (features[877] <= 8.489207752332371) {
                                                classes[0] = 0; 
                                                classes[1] = 11; 
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 9; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 103; 
                                        }
                                    } else {
                                        if (features[222] <= 26.606685533268106) {
                                            classes[0] = 3; 
                                            classes[1] = 7; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 23; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 2486; 
                                }
                            }
                        }
                    } else {
                        if (features[999] <= 32.08147454679232) {
                            if (features[1000] <= 19.35974036693127) {
                                if (features[650] <= 25.410510966150945) {
                                    if (features[388] <= 147.64661633068087) {
                                        classes[0] = 0; 
                                        classes[1] = 35; 
                                    } else {
                                        classes[0] = 13; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    if (features[69] <= 37.6791829489352) {
                                        if (features[234] <= 10.682294080663677) {
                                            classes[0] = 39; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[852] <= 19.13622926500027) {
                                                classes[0] = 11; 
                                                classes[1] = 2; 
                                            } else {
                                                classes[0] = 12; 
                                                classes[1] = 3; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 950; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 281; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3559; 
                        }
                    }
                }
            } else {
                if (features[412] <= 6.469008717420366) {
                    classes[0] = 4481; 
                    classes[1] = 0; 
                } else {
                    if (features[1178] <= 74.23186754830854) {
                        classes[0] = 6; 
                        classes[1] = 7; 
                    } else {
                        classes[0] = 13; 
                        classes[1] = 0; 
                    }
                }
            }
        } else {
            if (features[383] <= 162.78339047924214) {
                if (features[639] <= 171.02709370498224) {
                    if (features[341] <= 1.5163430648617457) {
                        if (features[30] <= 47.196982479948076) {
                            if (features[1023] <= 26.06607206426898) {
                                if (features[951] <= 64.59387526202977) {
                                    if (features[782] <= 26.168696247752585) {
                                        if (features[1395] <= 11.014839076234125) {
                                            if (features[1111] <= 4.021440916001424) {
                                                if (features[107] <= 21.27564626383244) {
                                                    classes[0] = 0; 
                                                    classes[1] = 250; 
                                                } else {
                                                    if (features[955] <= 40.55128025391233) {
                                                        if (features[5] <= 60.22676372553025) {
                                                            classes[0] = 0; 
                                                            classes[1] = 30; 
                                                        } else {
                                                            if (features[379] <= 9.983323044990776) {
                                                                if (features[1445] <= 13.69571003765835) {
                                                                    classes[0] = 12; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    classes[0] = 9; 
                                                                    classes[1] = 1; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 11; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[1004] <= 0.18759229593114876) {
                                                            classes[0] = 59; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[970] <= 22.95909528104358) {
                                                                classes[0] = 10; 
                                                                classes[1] = 3; 
                                                            } else {
                                                                classes[0] = 17; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1935; 
                                            }
                                        } else {
                                            if (features[983] <= 13.99771266633614) {
                                                if (features[186] <= 7.00680164935869) {
                                                    classes[0] = 243; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[881] <= 31.374469270220803) {
                                                        classes[0] = 7; 
                                                        classes[1] = 4; 
                                                    } else {
                                                        classes[0] = 84; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 179; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 375; 
                                        classes[1] = 6; 
                                    }
                                } else {
                                    if (features[884] <= 55.137810076931444) {
                                        if (features[982] <= 66.99933719951427) {
                                            if (features[373] <= 3.9536734046040176) {
                                                if (features[383] <= 74.21034208788143) {
                                                    classes[0] = 2389; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 38; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 51; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 391; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 346; 
                                    }
                                }
                            } else {
                                if (features[222] <= 17.30282588092083) {
                                    if (features[618] <= 6.5683698578553225) {
                                        if (features[985] <= 13.417375631114338) {
                                            if (features[228] <= 11.291482717611503) {
                                                classes[0] = 2632; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[157] <= 25.50812778638556) {
                                                    classes[0] = 7; 
                                                    classes[1] = 5; 
                                                } else {
                                                    classes[0] = 34; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 7; 
                                            classes[1] = 5; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 13; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 58; 
                                }
                            }
                        } else {
                            if (features[186] <= 113.21240336577124) {
                                if (features[960] <= 48.02106533737602) {
                                    classes[0] = 1789; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[1371] <= 0.02044542726414435) {
                                        if (features[1142] <= 5.289080351548072) {
                                            classes[0] = 27; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[185] <= 100.65534062220897) {
                                                classes[0] = 4; 
                                                classes[1] = 6; 
                                            } else {
                                                classes[0] = 16; 
                                                classes[1] = 1; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 81; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[1113] <= 6.834841135702319) {
                                    classes[0] = 652; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 74; 
                                }
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 254; 
                    }
                } else {
                    if (features[611] <= 18.572134243822685) {
                        if (features[1378] <= 0.12592435784228917) {
                            if (features[1412] <= 29.957426890214943) {
                                if (features[1132] <= 67.68374056799158) {
                                    classes[0] = 0; 
                                    classes[1] = 152; 
                                } else {
                                    classes[0] = 133; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[795] <= 21.978614556551417) {
                                    if (features[943] <= 110.07715223245296) {
                                        classes[0] = 0; 
                                        classes[1] = 636; 
                                    } else {
                                        if (features[790] <= 16.33256275913046) {
                                            classes[0] = 0; 
                                            classes[1] = 486; 
                                        } else {
                                            if (features[206] <= 25.65750425396889) {
                                                classes[0] = 1; 
                                                classes[1] = 10; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 69; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[962] <= 42.89045322433064) {
                                        classes[0] = 31; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[1190] <= 0.006953524597472325) {
                                            classes[0] = 0; 
                                            classes[1] = 77; 
                                        } else {
                                            classes[0] = 11; 
                                            classes[1] = 0; 
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[846] <= 67.07428825079488) {
                                if (features[826] <= 44.07848633830984) {
                                    if (features[37] <= 34.316818311950485) {
                                        classes[0] = 0; 
                                        classes[1] = 1066; 
                                    } else {
                                        if (features[393] <= 19.12160645940646) {
                                            classes[0] = 0; 
                                            classes[1] = 131; 
                                        } else {
                                            if (features[400] <= 34.53021391978903) {
                                                classes[0] = 0; 
                                                classes[1] = 24; 
                                            } else {
                                                classes[0] = 1; 
                                                classes[1] = 11; 
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 2; 
                                    classes[1] = 10; 
                                }
                            } else {
                                classes[0] = 1; 
                                classes[1] = 15; 
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 907; 
                    }
                }
            } else {
                if (features[255] <= 103.9523756816218) {
                    if (features[1380] <= 7.617977872968433) {
                        if (features[427] <= 3.4027232471444426) {
                            if (features[13] <= 31.420640673430086) {
                                classes[0] = 0; 
                                classes[1] = 2861; 
                            } else {
                                if (features[1125] <= 122.451506606685) {
                                    if (features[883] <= 8.74692270957761) {
                                        classes[0] = 15; 
                                        classes[1] = 2; 
                                    } else {
                                        if (features[942] <= 61.43957431109013) {
                                            if (features[223] <= 11.698286678659734) {
                                                classes[0] = 5; 
                                                classes[1] = 11; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 52; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 1468; 
                                        }
                                    }
                                } else {
                                    if (features[98] <= 107.83925438824876) {
                                        classes[0] = 9; 
                                        classes[1] = 3; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 22; 
                                    }
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2364; 
                        }
                    } else {
                        if (features[1151] <= 5.57954756888264) {
                            classes[0] = 68; 
                            classes[1] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 443; 
                        }
                    }
                } else {
                    if (features[1158] <= 6.7050044488132805) {
                        if (features[988] <= 12.177982755682471) {
                            classes[0] = 1186; 
                            classes[1] = 0; 
                        } else {
                            if (features[187] <= 42.28955318273315) {
                                classes[0] = 3; 
                                classes[1] = 7; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 14; 
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 145; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_7(double[] features) {
        int[] classes = new int[2];
        
        if (features[1130] <= 195.49418015492995) {
            if (features[996] <= 11.178642563827356) {
                if (features[1431] <= 146.1544356994726) {
                    if (features[1120] <= 38.388910131267664) {
                        if (features[1464] <= 143.49601142052546) {
                            if (features[154] <= 50.22639223409934) {
                                if (features[99] <= 5.471602899782093) {
                                    if (features[788] <= 1.1583619392070594) {
                                        classes[0] = 7; 
                                        classes[1] = 4; 
                                    } else {
                                        classes[0] = 32; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 61; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[199] <= 59.06760499344461) {
                                    classes[0] = 5689; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 15; 
                                    classes[1] = 1; 
                                }
                            }
                        } else {
                            classes[0] = 11; 
                            classes[1] = 3; 
                        }
                    } else {
                        if (features[655] <= 13.127941928397837) {
                            if (features[138] <= 76.19126565145221) {
                                if (features[1432] <= 34.28580329855554) {
                                    if (features[658] <= 10.858901188034665) {
                                        if (features[69] <= 8.107470537879523) {
                                            classes[0] = 0; 
                                            classes[1] = 19112; 
                                        } else {
                                            if (features[977] <= 35.82420058447382) {
                                                if (features[652] <= 10.288608305943756) {
                                                    classes[0] = 0; 
                                                    classes[1] = 3351; 
                                                } else {
                                                    if (features[1433] <= 3.317532143143508) {
                                                        if (features[822] <= 4.099123532962891) {
                                                            if (features[928] <= 21.50942834961444) {
                                                                classes[0] = 12; 
                                                                classes[1] = 4; 
                                                            } else {
                                                                classes[0] = 8; 
                                                                classes[1] = 2; 
                                                            }
                                                        } else {
                                                            if (features[360] <= 0.043951861257125684) {
                                                                classes[0] = 11; 
                                                                classes[1] = 2; 
                                                            } else {
                                                                classes[0] = 86; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[409] <= 7.286582995344196) {
                                                            if (features[1011] <= 4.409053903592406) {
                                                                if (features[1108] <= 3.1607311629503996) {
                                                                    classes[0] = 92; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    if (features[32] <= 8.180490221697392) {
                                                                        classes[0] = 20; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 15; 
                                                                        classes[1] = 6; 
                                                                    }
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 93; 
                                                            }
                                                        } else {
                                                            if (features[236] <= 9.664960144740721) {
                                                                if (features[397] <= 44.369906864409614) {
                                                                    if (features[626] <= 25.857099470675298) {
                                                                        if (features[1392] <= 3.1190643001980956) {
                                                                            if (features[414] <= 3.3992320239932563) {
                                                                                if (features[1139] <= 10.533651267015651) {
                                                                                    classes[0] = 12; 
                                                                                    classes[1] = 0; 
                                                                                } else {
                                                                                    classes[0] = 0; 
                                                                                    classes[1] = 52; 
                                                                                }
                                                                            } else {
                                                                                classes[0] = 0; 
                                                                                classes[1] = 97; 
                                                                            }
                                                                        } else {
                                                                            if (features[402] <= 17.007312652152386) {
                                                                                classes[0] = 0; 
                                                                                classes[1] = 11; 
                                                                            } else {
                                                                                classes[0] = 16; 
                                                                                classes[1] = 0; 
                                                                            }
                                                                        }
                                                                    } else {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 460; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 13; 
                                                                    classes[1] = 1; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 298; 
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 1427; 
                                            }
                                        }
                                    } else {
                                        if (features[390] <= 17.40907455102509) {
                                            if (features[1112] <= 13.082579352669548) {
                                                classes[0] = 40; 
                                                classes[1] = 3; 
                                            } else {
                                                classes[0] = 147; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 36; 
                                        }
                                    }
                                } else {
                                    if (features[1397] <= 4.520435123299883) {
                                        if (features[935] <= 16.378230731322315) {
                                            if (features[1413] <= 122.27545395706709) {
                                                if (features[1392] <= 1.2720426613974878) {
                                                    classes[0] = 0; 
                                                    classes[1] = 561; 
                                                } else {
                                                    if (features[379] <= 22.927356775333493) {
                                                        classes[0] = 0; 
                                                        classes[1] = 33; 
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 19; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 238; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 771; 
                                        }
                                    } else {
                                        if (features[1092] <= 0.06434212992907906) {
                                            if (features[1127] <= 17.380094598795797) {
                                                if (features[943] <= 9.41512347855862) {
                                                    if (features[1152] <= 0.7833669294860516) {
                                                        classes[0] = 467; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 29; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 214; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 161; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 317; 
                                        }
                                    }
                                }
                            } else {
                                if (features[798] <= 25.871283429880815) {
                                    classes[0] = 0; 
                                    classes[1] = 9375; 
                                } else {
                                    if (features[930] <= 117.3681959526474) {
                                        if (features[174] <= 17.494966927316046) {
                                            classes[0] = 1; 
                                            classes[1] = 11; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 29; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 607; 
                                    }
                                }
                            }
                        } else {
                            if (features[968] <= 38.49990966996444) {
                                if (features[1395] <= 4.850679832207157) {
                                    if (features[643] <= 118.85589160282775) {
                                        classes[0] = 0; 
                                        classes[1] = 415; 
                                    } else {
                                        if (features[40] <= 11.592536194669236) {
                                            classes[0] = 3; 
                                            classes[1] = 7; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 12; 
                                        }
                                    }
                                } else {
                                    if (features[357] <= 12.479717541470967) {
                                        if (features[58] <= 8.806164813405267) {
                                            if (features[1018] <= 8.810012883956691) {
                                                if (features[427] <= 0.1268334129695392) {
                                                    if (features[957] <= 12.519216340822867) {
                                                        if (features[875] <= 9.091204735267608) {
                                                            if (features[929] <= 15.449647626726415) {
                                                                if (features[67] <= 11.332141712155499) {
                                                                    if (features[1425] <= 42.71759202445423) {
                                                                        classes[0] = 6; 
                                                                        classes[1] = 4; 
                                                                    } else {
                                                                        classes[0] = 29; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 20; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                classes[0] = 412; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            classes[0] = 14; 
                                                            classes[1] = 2; 
                                                        }
                                                    } else {
                                                        classes[0] = 11; 
                                                        classes[1] = 3; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 77; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 650; 
                                            }
                                        } else {
                                            if (features[1329] <= 0.044879781639564846) {
                                                if (features[227] <= 0.30629978775920935) {
                                                    classes[0] = 0; 
                                                    classes[1] = 15; 
                                                } else {
                                                    if (features[1092] <= 1.1097703708995634) {
                                                        if (features[1091] <= 0.10341272082712803) {
                                                            if (features[436] <= 0.5848178100825705) {
                                                                if (features[361] <= 1.8607665774930715) {
                                                                    if (features[220] <= 7.274223676686717) {
                                                                        if (features[369] <= 1.6931922441883533) {
                                                                            if (features[135] <= 13.294256444440771) {
                                                                                if (features[165] <= 9.289677345189963) {
                                                                                    classes[0] = 13; 
                                                                                    classes[1] = 1; 
                                                                                } else {
                                                                                    classes[0] = 30; 
                                                                                    classes[1] = 0; 
                                                                                }
                                                                            } else {
                                                                                classes[0] = 883; 
                                                                                classes[1] = 0; 
                                                                            }
                                                                        } else {
                                                                            classes[0] = 4958; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    } else {
                                                                        if (features[902] <= 8.789110966492737) {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 34; 
                                                                        } else {
                                                                            if (features[1019] <= 22.934987108934784) {
                                                                                if (features[871] <= 25.35392921719084) {
                                                                                    if (features[999] <= 4.565293382355536) {
                                                                                        if (features[888] <= 26.59407461007733) {
                                                                                            if (features[368] <= 3.895416808212992) {
                                                                                                classes[0] = 11; 
                                                                                                classes[1] = 1; 
                                                                                            } else {
                                                                                                classes[0] = 106; 
                                                                                                classes[1] = 0; 
                                                                                            }
                                                                                        } else {
                                                                                            classes[0] = 9; 
                                                                                            classes[1] = 1; 
                                                                                        }
                                                                                    } else {
                                                                                        classes[0] = 19; 
                                                                                        classes[1] = 2; 
                                                                                    }
                                                                                } else {
                                                                                    classes[0] = 135; 
                                                                                    classes[1] = 0; 
                                                                                }
                                                                            } else {
                                                                                classes[0] = 434; 
                                                                                classes[1] = 0; 
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (features[72] <= 18.090671408704132) {
                                                                        if (features[910] <= 11.890186033837157) {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 26; 
                                                                        } else {
                                                                            classes[0] = 2; 
                                                                            classes[1] = 10; 
                                                                        }
                                                                    } else {
                                                                        if (features[889] <= 51.185235035353756) {
                                                                            classes[0] = 10; 
                                                                            classes[1] = 6; 
                                                                        } else {
                                                                            classes[0] = 567; 
                                                                            classes[1] = 0; 
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 10; 
                                                            }
                                                        } else {
                                                            if (features[955] <= 16.51741418071807) {
                                                                classes[0] = 0; 
                                                                classes[1] = 51; 
                                                            } else {
                                                                classes[0] = 4; 
                                                                classes[1] = 12; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 16; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 113; 
                                            }
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 155; 
                                    }
                                }
                            } else {
                                if (features[843] <= 76.75672902414858) {
                                    classes[0] = 0; 
                                    classes[1] = 1318; 
                                } else {
                                    classes[0] = 1; 
                                    classes[1] = 19; 
                                }
                            }
                        }
                    }
                } else {
                    if (features[1106] <= 4.05024884782897) {
                        classes[0] = 2449; 
                        classes[1] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 35; 
                    }
                }
            } else {
                if (features[1125] <= 75.48830406202143) {
                    if (features[65] <= 43.6785528064584) {
                        classes[0] = 0; 
                        classes[1] = 21653; 
                    } else {
                        if (features[985] <= 82.41179520552802) {
                            if (features[212] <= 47.64407914786776) {
                                if (features[834] <= 45.27244944998509) {
                                    if (features[670] <= 0.3062810148959593) {
                                        classes[0] = 0; 
                                        classes[1] = 261; 
                                    } else {
                                        classes[0] = 4; 
                                        classes[1] = 7; 
                                    }
                                } else {
                                    if (features[1012] <= 4.223259608150628) {
                                        classes[0] = 0; 
                                        classes[1] = 12; 
                                    } else {
                                        classes[0] = 46; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 642; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4469; 
                        }
                    }
                } else {
                    if (features[203] <= 20.10208933409165) {
                        if (features[1117] <= 65.61508331078949) {
                            classes[0] = 0; 
                            classes[1] = 287; 
                        } else {
                            classes[0] = 133; 
                            classes[1] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2844; 
                    }
                }
            }
        } else {
            classes[0] = 5435; 
            classes[1] = 0; 
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_8(double[] features) {
        int[] classes = new int[2];
        
        if (features[434] <= 56.68179671591231) {
            if (features[776] <= 34.2092188568788) {
                if (features[203] <= 24.85406017100873) {
                    if (features[635] <= 97.21514394253074) {
                        if (features[457] <= 0.9524704228504061) {
                            if (features[30] <= 39.50518593735912) {
                                if (features[414] <= 0.3420250286821368) {
                                    if (features[1019] <= 8.57032298610275) {
                                        if (features[857] <= 1.8805526089690343) {
                                            classes[0] = 0; 
                                            classes[1] = 24; 
                                        } else {
                                            classes[0] = 1979; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        if (features[211] <= 6.41458162639244) {
                                            classes[0] = 139; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[25] <= 8.404912419677386) {
                                                classes[0] = 0; 
                                                classes[1] = 35; 
                                            } else {
                                                if (features[336] <= 0.03567318533972281) {
                                                    if (features[232] <= 16.794603006376363) {
                                                        if (features[376] <= 19.17484148270789) {
                                                            classes[0] = 0; 
                                                            classes[1] = 20; 
                                                        } else {
                                                            classes[0] = 3; 
                                                            classes[1] = 7; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 40; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 81; 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1156] <= 0.08666883844578827) {
                                        if (features[1013] <= 4.753830125825212) {
                                            if (features[784] <= 2.9234262113766705) {
                                                classes[0] = 0; 
                                                classes[1] = 418; 
                                            } else {
                                                if (features[983] <= 7.942360402712104) {
                                                    if (features[1012] <= 0.4398775368357466) {
                                                        classes[0] = 0; 
                                                        classes[1] = 233; 
                                                    } else {
                                                        if (features[990] <= 3.870427092199174) {
                                                            classes[0] = 1111; 
                                                            classes[1] = 0; 
                                                        } else {
                                                            if (features[778] <= 13.429353094084812) {
                                                                classes[0] = 10; 
                                                                classes[1] = 1; 
                                                            } else {
                                                                classes[0] = 218; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 157; 
                                                }
                                            }
                                        } else {
                                            if (features[118] <= 11.070387970572755) {
                                                classes[0] = 0; 
                                                classes[1] = 822; 
                                            } else {
                                                if (features[938] <= 17.06024210107718) {
                                                    classes[0] = 0; 
                                                    classes[1] = 124; 
                                                } else {
                                                    if (features[240] <= 7.20984608084345) {
                                                        classes[0] = 20; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 25; 
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[155] <= 23.132828546569904) {
                                            if (features[630] <= 147.71970054268607) {
                                                if (features[123] <= 24.1489696684335) {
                                                    if (features[390] <= 93.63317859959936) {
                                                        if (features[633] <= 70.73204738951014) {
                                                            classes[0] = 0; 
                                                            classes[1] = 20709; 
                                                        } else {
                                                            if (features[151] <= 8.65849174122554) {
                                                                if (features[1127] <= 15.656690018698814) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 162; 
                                                                } else {
                                                                    classes[0] = 9; 
                                                                    classes[1] = 8; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 654; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[1389] <= 1.1338229775416495) {
                                                            classes[0] = 0; 
                                                            classes[1] = 157; 
                                                        } else {
                                                            if (features[373] <= 20.376956516391697) {
                                                                classes[0] = 12; 
                                                                classes[1] = 2; 
                                                            } else {
                                                                classes[0] = 26; 
                                                                classes[1] = 0; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[56] <= 12.067898705256654) {
                                                        classes[0] = 0; 
                                                        classes[1] = 276; 
                                                    } else {
                                                        if (features[416] <= 8.30845619755191) {
                                                            classes[0] = 2; 
                                                            classes[1] = 8; 
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 41; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (features[852] <= 11.088854055715867) {
                                                    classes[0] = 8; 
                                                    classes[1] = 4; 
                                                } else {
                                                    classes[0] = 33; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            if (features[1424] <= 85.41503317021468) {
                                                if (features[93] <= 17.070390076496587) {
                                                    if (features[641] <= 47.38687166557295) {
                                                        if (features[1419] <= 180.08816976881107) {
                                                            classes[0] = 9; 
                                                            classes[1] = 5; 
                                                        } else {
                                                            classes[0] = 18; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        if (features[869] <= 10.689652261272885) {
                                                            if (features[55] <= 11.158394528202908) {
                                                                if (features[387] <= 79.25238749031683) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 3253; 
                                                                } else {
                                                                    if (features[811] <= 4.634010293794117) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 205; 
                                                                    } else {
                                                                        if (features[1433] <= 28.995606744736378) {
                                                                            classes[0] = 1; 
                                                                            classes[1] = 10; 
                                                                        } else {
                                                                            classes[0] = 0; 
                                                                            classes[1] = 51; 
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (features[595] <= 7.51466430475445) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 164; 
                                                                } else {
                                                                    classes[0] = 3; 
                                                                    classes[1] = 17; 
                                                                }
                                                            }
                                                        } else {
                                                            if (features[653] <= 10.452085627698517) {
                                                                classes[0] = 0; 
                                                                classes[1] = 281; 
                                                            } else {
                                                                if (features[1463] <= 7.085477483959) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 29; 
                                                                } else {
                                                                    classes[0] = 128; 
                                                                    classes[1] = 0; 
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[451] <= 0.031622985970918484) {
                                                        if (features[1190] <= 0.029779066225204123) {
                                                            if (features[125] <= 36.03225122406725) {
                                                                if (features[188] <= 37.61562045800906) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 169; 
                                                                } else {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 15; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 3601; 
                                                            }
                                                        } else {
                                                            if (features[1394] <= 0.8543351219328256) {
                                                                classes[0] = 0; 
                                                                classes[1] = 37; 
                                                            } else {
                                                                classes[0] = 5; 
                                                                classes[1] = 5; 
                                                            }
                                                        }
                                                    } else {
                                                        if (features[1147] <= 7.510873621905818) {
                                                            classes[0] = 3; 
                                                            classes[1] = 13; 
                                                        } else {
                                                            classes[0] = 13; 
                                                            classes[1] = 0; 
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (features[1144] <= 34.06093491781873) {
                                                    if (features[1409] <= 28.078236692872846) {
                                                        if (features[914] <= 72.1120326125027) {
                                                            if (features[45] <= 13.105193594458495) {
                                                                classes[0] = 650; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 15; 
                                                                classes[1] = 1; 
                                                            }
                                                        } else {
                                                            if (features[44] <= 9.471466687046018) {
                                                                classes[0] = 15; 
                                                                classes[1] = 0; 
                                                            } else {
                                                                classes[0] = 10; 
                                                                classes[1] = 2; 
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 1; 
                                                        classes[1] = 15; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 60; 
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[671] <= 10.219024323708506) {
                                    if (features[171] <= 181.5562129493599) {
                                        classes[0] = 0; 
                                        classes[1] = 30; 
                                    } else {
                                        classes[0] = 39; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 707; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            classes[0] = 1249; 
                            classes[1] = 0; 
                        }
                    } else {
                        if (features[7] <= 16.243095614477596) {
                            if (features[208] <= 4.688965938213475) {
                                if (features[1387] <= 0.5470337083023848) {
                                    if (features[166] <= 67.77474648707468) {
                                        if (features[977] <= 2.223428269203186) {
                                            classes[0] = 2; 
                                            classes[1] = 14; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 62; 
                                        }
                                    } else {
                                        if (features[141] <= 82.93782049072163) {
                                            classes[0] = 17; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 8; 
                                            classes[1] = 2; 
                                        }
                                    }
                                } else {
                                    if (features[238] <= 1.036255550385764) {
                                        classes[0] = 0; 
                                        classes[1] = 12; 
                                    } else {
                                        classes[0] = 534; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[663] <= 0.48781234944741886) {
                                    classes[0] = 0; 
                                    classes[1] = 904; 
                                } else {
                                    if (features[367] <= 4.611387375681138) {
                                        if (features[637] <= 96.68891782065359) {
                                            classes[0] = 2; 
                                            classes[1] = 8; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 47; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 110; 
                                    }
                                }
                            }
                        } else {
                            if (features[356] <= 13.936179273870511) {
                                if (features[351] <= 0.37262636882467076) {
                                    if (features[202] <= 18.355677438703577) {
                                        if (features[642] <= 126.52897409406879) {
                                            if (features[916] <= 31.641098356155698) {
                                                if (features[100] <= 21.91597785518673) {
                                                    if (features[785] <= 6.483855527646666) {
                                                        if (features[1390] <= 2.3302670107975745) {
                                                            classes[0] = 1; 
                                                            classes[1] = 16; 
                                                        } else {
                                                            classes[0] = 23; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        if (features[993] <= 2.592649074898894) {
                                                            if (features[875] <= 14.51848684730192) {
                                                                if (features[994] <= 0.06971926552667715) {
                                                                    if (features[946] <= 45.467072327332076) {
                                                                        classes[0] = 11; 
                                                                        classes[1] = 6; 
                                                                    } else {
                                                                        classes[0] = 157; 
                                                                        classes[1] = 0; 
                                                                    }
                                                                } else {
                                                                    classes[0] = 534; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                classes[0] = 5; 
                                                                classes[1] = 6; 
                                                            }
                                                        } else {
                                                            classes[0] = 10; 
                                                            classes[1] = 8; 
                                                        }
                                                    }
                                                } else {
                                                    if (features[680] <= 23.389777929098777) {
                                                        if (features[1132] <= 14.0333816287893) {
                                                            if (features[1393] <= 0.22203379635747936) {
                                                                classes[0] = 4; 
                                                                classes[1] = 7; 
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 19; 
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 22; 
                                                        }
                                                    } else {
                                                        classes[0] = 29; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                if (features[987] <= 0.6285273614164003) {
                                                    if (features[78] <= 18.447929361687137) {
                                                        classes[0] = 645; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 7; 
                                                        classes[1] = 6; 
                                                    }
                                                } else {
                                                    if (features[874] <= 14.322297566626514) {
                                                        if (features[855] <= 7.225586987952804) {
                                                            classes[0] = 12; 
                                                            classes[1] = 1; 
                                                        } else {
                                                            classes[0] = 160; 
                                                            classes[1] = 0; 
                                                        }
                                                    } else {
                                                        classes[0] = 1773; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[21] <= 29.49070453303444) {
                                                classes[0] = 0; 
                                                classes[1] = 39; 
                                            } else {
                                                classes[0] = 5; 
                                                classes[1] = 5; 
                                            }
                                        }
                                    } else {
                                        if (features[592] <= 4.178778608461637) {
                                            if (features[159] <= 118.90827650299879) {
                                                if (features[941] <= 44.14612259255821) {
                                                    classes[0] = 0; 
                                                    classes[1] = 178; 
                                                } else {
                                                    if (features[378] <= 18.23864007875069) {
                                                        classes[0] = 6; 
                                                        classes[1] = 13; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 28; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 83; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 192; 
                                            classes[1] = 0; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 36; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 74; 
                            }
                        }
                    }
                } else {
                    if (features[174] <= 24.222733697450483) {
                        if (features[255] <= 5.128632015161152) {
                            classes[0] = 0; 
                            classes[1] = 1679; 
                        } else {
                            if (features[630] <= 79.8427270707953) {
                                if (features[1393] <= 2.6239465881476387) {
                                    classes[0] = 0; 
                                    classes[1] = 243; 
                                } else {
                                    if (features[931] <= 17.93628763618468) {
                                        classes[0] = 0; 
                                        classes[1] = 18; 
                                    } else {
                                        if (features[121] <= 15.733960846616096) {
                                            if (features[1417] <= 79.57403800949919) {
                                                classes[0] = 51; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 7; 
                                                classes[1] = 4; 
                                            }
                                        } else {
                                            if (features[0] <= 74.57846140909339) {
                                                classes[0] = 107; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[217] <= 5.813690103157497) {
                                                    classes[0] = 70; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 8; 
                                                    classes[1] = 2; 
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 132; 
                                classes[1] = 0; 
                            }
                        }
                    } else {
                        if (features[1415] <= 98.30840507574867) {
                            if (features[860] <= 22.8004668092228) {
                                if (features[803] <= 14.328340985753927) {
                                    if (features[183] <= 12.805721729508006) {
                                        classes[0] = 22; 
                                        classes[1] = 1; 
                                    } else {
                                        if (features[775] <= 38.241698162297226) {
                                            if (features[1420] <= 89.94714347102249) {
                                                classes[0] = 0; 
                                                classes[1] = 3624; 
                                            } else {
                                                if (features[34] <= 31.371676681270735) {
                                                    if (features[636] <= 211.06535008527368) {
                                                        classes[0] = 0; 
                                                        classes[1] = 2154; 
                                                    } else {
                                                        if (features[24] <= 15.05139881511556) {
                                                            if (features[164] <= 95.06518526056706) {
                                                                classes[0] = 0; 
                                                                classes[1] = 24; 
                                                            } else {
                                                                classes[0] = 11; 
                                                                classes[1] = 0; 
                                                            }
                                                        } else {
                                                            if (features[92] <= 20.035626171961567) {
                                                                if (features[97] <= 17.651911970082) {
                                                                    classes[0] = 0; 
                                                                    classes[1] = 33; 
                                                                } else {
                                                                    classes[0] = 1; 
                                                                    classes[1] = 11; 
                                                                }
                                                            } else {
                                                                classes[0] = 0; 
                                                                classes[1] = 286; 
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[12] <= 36.73795783296237) {
                                                        classes[0] = 3; 
                                                        classes[1] = 10; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 14; 
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[871] <= 16.103226719295158) {
                                                if (features[785] <= 17.146273808881613) {
                                                    classes[0] = 3; 
                                                    classes[1] = 9; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 12; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 30; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1130] <= 243.95034305338353) {
                                        classes[0] = 0; 
                                        classes[1] = 387; 
                                    } else {
                                        classes[0] = 56; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2584; 
                            }
                        } else {
                            if (features[640] <= 194.15145883954702) {
                                if (features[1130] <= 140.3869827100917) {
                                    classes[0] = 0; 
                                    classes[1] = 3592; 
                                } else {
                                    classes[0] = 980; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 11147; 
                            }
                        }
                    }
                }
            } else {
                if (features[982] <= 42.56599121139338) {
                    if (features[986] <= 25.775997249557825) {
                        if (features[924] <= 30.429786708141553) {
                            if (features[417] <= 10.64313875247837) {
                                if (features[675] <= 0.35836037382892355) {
                                    if (features[978] <= 11.832121659916927) {
                                        if (features[970] <= 8.247864777899757) {
                                            classes[0] = 1068; 
                                            classes[1] = 0; 
                                        } else {
                                            if (features[799] <= 25.311454498303913) {
                                                classes[0] = 9; 
                                                classes[1] = 1; 
                                            } else {
                                                classes[0] = 148; 
                                                classes[1] = 0; 
                                            }
                                        }
                                    } else {
                                        if (features[245] <= 9.700274220305205) {
                                            classes[0] = 0; 
                                            classes[1] = 156; 
                                        } else {
                                            classes[0] = 4; 
                                            classes[1] = 13; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 177; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 1027; 
                            }
                        } else {
                            if (features[117] <= 103.12874040544473) {
                                if (features[639] <= 216.80841631877485) {
                                    if (features[832] <= 8.282615580498987) {
                                        if (features[1446] <= 16.83259306793159) {
                                            if (features[162] <= 129.94728170225497) {
                                                if (features[640] <= 98.39493924435432) {
                                                    classes[0] = 26; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 19; 
                                                    classes[1] = 4; 
                                                }
                                            } else {
                                                if (features[1151] <= 5.229901151850995) {
                                                    if (features[916] <= 65.22668455886904) {
                                                        classes[0] = 42; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 12; 
                                                        classes[1] = 1; 
                                                    }
                                                } else {
                                                    classes[0] = 235; 
                                                    classes[1] = 0; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 310; 
                                        }
                                    } else {
                                        if (features[422] <= 12.97479187233615) {
                                            if (features[224] <= 33.18397722808299) {
                                                if (features[103] <= 89.8273679090902) {
                                                    if (features[896] <= 87.92218722190503) {
                                                        if (features[602] <= 17.28108880134184) {
                                                            if (features[632] <= 90.19238567101588) {
                                                                if (features[24] <= 52.80306043154802) {
                                                                    if (features[396] <= 24.428029843942266) {
                                                                        classes[0] = 0; 
                                                                        classes[1] = 41; 
                                                                    } else {
                                                                        if (features[914] <= 66.51721621767078) {
                                                                            classes[0] = 800; 
                                                                            classes[1] = 0; 
                                                                        } else {
                                                                            classes[0] = 13; 
                                                                            classes[1] = 2; 
                                                                        }
                                                                    }
                                                                } else {
                                                                    classes[0] = 1193; 
                                                                    classes[1] = 0; 
                                                                }
                                                            } else {
                                                                if (features[386] <= 146.08107756700326) {
                                                                    classes[0] = 2761; 
                                                                    classes[1] = 0; 
                                                                } else {
                                                                    if (features[953] <= 129.26749196150882) {
                                                                        classes[0] = 802; 
                                                                        classes[1] = 0; 
                                                                    } else {
                                                                        classes[0] = 5; 
                                                                        classes[1] = 5; 
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 0; 
                                                            classes[1] = 18; 
                                                        }
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 25; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 34; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 104; 
                                            }
                                        } else {
                                            if (features[69] <= 51.99195356076227) {
                                                classes[0] = 0; 
                                                classes[1] = 137; 
                                            } else {
                                                classes[0] = 2; 
                                                classes[1] = 11; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[774] <= 51.85139746058654) {
                                        classes[0] = 0; 
                                        classes[1] = 326; 
                                    } else {
                                        if (features[653] <= 0.9335397112829039) {
                                            classes[0] = 2; 
                                            classes[1] = 14; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 48; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 706; 
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1025; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 6854; 
                }
            }
        } else {
            if (features[132] <= 57.22792361313554) {
                classes[0] = 2972; 
                classes[1] = 0; 
            } else {
                if (features[454] <= 14.05517338740454) {
                    classes[0] = 16; 
                    classes[1] = 1; 
                } else {
                    classes[0] = 263; 
                    classes[1] = 0; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_9(double[] features) {
        int[] classes = new int[2];
        
        if (features[200] <= 28.25544002192778) {
            if (features[64] <= 17.57898197430962) {
                if (features[152] <= 41.35930368848551) {
                    if (features[925] <= 20.152622769388437) {
                        if (features[994] <= 3.3422928493853234) {
                            if (features[851] <= 7.005747537501049) {
                                if (features[84] <= 9.796986331895999) {
                                    if (features[855] <= 5.631812057274904) {
                                        if (features[768] <= 39.006518459143265) {
                                            if (features[206] <= 1.2496140880164115) {
                                                classes[0] = 1; 
                                                classes[1] = 9; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 17; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 3682; 
                                        }
                                    } else {
                                        if (features[1441] <= 6.430245528195461) {
                                            if (features[414] <= 13.41303491299667) {
                                                if (features[814] <= 4.329517874304532) {
                                                    classes[0] = 3; 
                                                    classes[1] = 8; 
                                                } else {
                                                    if (features[233] <= 1.5854246592045635) {
                                                        classes[0] = 8; 
                                                        classes[1] = 2; 
                                                    } else {
                                                        classes[0] = 123; 
                                                        classes[1] = 0; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 26; 
                                            }
                                        } else {
                                            if (features[392] <= 30.693011504068405) {
                                                if (features[917] <= 9.67765901035582) {
                                                    classes[0] = 0; 
                                                    classes[1] = 75; 
                                                } else {
                                                    if (features[64] <= 7.040746653260218) {
                                                        classes[0] = 0; 
                                                        classes[1] = 27; 
                                                    } else {
                                                        classes[0] = 6; 
                                                        classes[1] = 5; 
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 185; 
                                            }
                                        }
                                    }
                                } else {
                                    if (features[1023] <= 1.1470193903662893) {
                                        classes[0] = 0; 
                                        classes[1] = 249; 
                                    } else {
                                        classes[0] = 214; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[651] <= 15.01886210139517) {
                                    if (features[596] <= 1.1435583654947266) {
                                        if (features[970] <= 3.8261122943309225) {
                                            if (features[1000] <= 0.7768347977957647) {
                                                classes[0] = 0; 
                                                classes[1] = 16; 
                                            } else {
                                                classes[0] = 10; 
                                                classes[1] = 0; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 469; 
                                        }
                                    } else {
                                        classes[0] = 5; 
                                        classes[1] = 16; 
                                    }
                                } else {
                                    if (features[978] <= 8.101682269180483) {
                                        if (features[672] <= 0.1256395096747375) {
                                            if (features[16] <= 13.429343193253102) {
                                                if (features[188] <= 7.543453412216742) {
                                                    classes[0] = 1940; 
                                                    classes[1] = 0; 
                                                } else {
                                                    if (features[414] <= 0.08550980733133208) {
                                                        classes[0] = 11; 
                                                        classes[1] = 0; 
                                                    } else {
                                                        classes[0] = 8; 
                                                        classes[1] = 4; 
                                                    }
                                                }
                                            } else {
                                                if (features[80] <= 13.835033950084915) {
                                                    classes[0] = 18; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 8; 
                                                    classes[1] = 2; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 13; 
                                            classes[1] = 4; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 25; 
                                    }
                                }
                            }
                        } else {
                            if (features[1382] <= 2.19857931041424) {
                                if (features[142] <= 22.757533973643397) {
                                    if (features[7] <= 32.35626346823862) {
                                        if (features[75] <= 14.330514942723273) {
                                            classes[0] = 0; 
                                            classes[1] = 20754; 
                                        } else {
                                            if (features[827] <= 7.513234948287379) {
                                                classes[0] = 0; 
                                                classes[1] = 188; 
                                            } else {
                                                if (features[1009] <= 10.896485983526526) {
                                                    classes[0] = 1; 
                                                    classes[1] = 13; 
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 151; 
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[983] <= 4.242995314960961) {
                                            if (features[627] <= 24.080038222579354) {
                                                classes[0] = 30; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 11; 
                                                classes[1] = 1; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 740; 
                                        }
                                    }
                                } else {
                                    if (features[145] <= 20.0069510756245) {
                                        if (features[616] <= 3.125207696305286) {
                                            classes[0] = 8; 
                                            classes[1] = 3; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 15; 
                                        }
                                    } else {
                                        if (features[1436] <= 9.855528844107967) {
                                            if (features[956] <= 6.187385085413793) {
                                                classes[0] = 12; 
                                                classes[1] = 0; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 62; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 468; 
                                        }
                                    }
                                }
                            } else {
                                if (features[61] <= 15.29328634146507) {
                                    if (features[148] <= 16.054714355173886) {
                                        classes[0] = 0; 
                                        classes[1] = 742; 
                                    } else {
                                        classes[0] = 1; 
                                        classes[1] = 11; 
                                    }
                                } else {
                                    if (features[911] <= 13.63134479867917) {
                                        classes[0] = 14; 
                                        classes[1] = 4; 
                                    } else {
                                        classes[0] = 158; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[795] <= 4.203120745628584) {
                            if (features[1416] <= 20.18549437611625) {
                                classes[0] = 133; 
                                classes[1] = 0; 
                            } else {
                                if (features[157] <= 16.80794972273421) {
                                    if (features[21] <= 7.17824088602447) {
                                        classes[0] = 0; 
                                        classes[1] = 11; 
                                    } else {
                                        classes[0] = 4; 
                                        classes[1] = 6; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 1500; 
                                }
                            }
                        } else {
                            if (features[227] <= 5.294130407167034) {
                                if (features[238] <= 1.136453095574981) {
                                    classes[0] = 0; 
                                    classes[1] = 72; 
                                } else {
                                    if (features[877] <= 6.803339239899231) {
                                        if (features[944] <= 14.100854426519064) {
                                            classes[0] = 36; 
                                            classes[1] = 0; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 30; 
                                        }
                                    } else {
                                        if (features[9] <= 40.2366721917939) {
                                            if (features[176] <= 18.639804422615953) {
                                                classes[0] = 1706; 
                                                classes[1] = 0; 
                                            } else {
                                                if (features[982] <= 9.581025931416809) {
                                                    classes[0] = 84; 
                                                    classes[1] = 0; 
                                                } else {
                                                    classes[0] = 17; 
                                                    classes[1] = 1; 
                                                }
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 31; 
                                        }
                                    }
                                }
                            } else {
                                if (features[603] <= 5.29883025044593) {
                                    classes[0] = 0; 
                                    classes[1] = 1025; 
                                } else {
                                    classes[0] = 18; 
                                    classes[1] = 1; 
                                }
                            }
                        }
                    }
                } else {
                    if (features[384] <= 56.38249846251852) {
                        if (features[374] <= 61.18979389701447) {
                            if (features[114] <= 53.46670058803319) {
                                if (features[184] <= 96.246126879221) {
                                    classes[0] = 6006; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[3] <= 97.26155940484146) {
                                        if (features[774] <= 67.93806994792935) {
                                            classes[0] = 11; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 11; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 27; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                classes[0] = 9; 
                                classes[1] = 1; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 90; 
                        }
                    } else {
                        if (features[1398] <= 0.8740573870493848) {
                            classes[0] = 0; 
                            classes[1] = 1616; 
                        } else {
                            if (features[140] <= 33.59268255584983) {
                                if (features[181] <= 27.047768812107805) {
                                    classes[0] = 1031; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 123; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 259; 
                            }
                        }
                    }
                }
            } else {
                if (features[164] <= 63.99039032842502) {
                    if (features[254] <= 61.72470147417364) {
                        if (features[1383] <= 1.2095490691315334) {
                            if (features[1182] <= 23.969304229300192) {
                                if (features[621] <= 16.606734252970814) {
                                    if (features[979] <= 10.850754891334198) {
                                        if (features[394] <= 21.673428036053952) {
                                            if (features[106] <= 23.401491958950686) {
                                                classes[0] = 6; 
                                                classes[1] = 9; 
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 118; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 149; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 146; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 242; 
                                }
                            } else {
                                classes[0] = 16; 
                                classes[1] = 0; 
                            }
                        } else {
                            if (features[208] <= 5.530432202726597) {
                                if (features[928] <= 13.7047989961909) {
                                    classes[0] = 444; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 15; 
                                    classes[1] = 8; 
                                }
                            } else {
                                if (features[1362] <= 0.43631068152201097) {
                                    if (features[349] <= 0.3955943390056377) {
                                        classes[0] = 8; 
                                        classes[1] = 4; 
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 20; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 105; 
                                }
                            }
                        }
                    } else {
                        if (features[993] <= 11.786661588373885) {
                            if (features[59] <= 11.56710452035598) {
                                classes[0] = 0; 
                                classes[1] = 23; 
                            } else {
                                if (features[867] <= 18.854105422727933) {
                                    if (features[77] <= 20.988935577402692) {
                                        if (features[808] <= 7.720873112224966) {
                                            classes[0] = 8; 
                                            classes[1] = 2; 
                                        } else {
                                            classes[0] = 12; 
                                            classes[1] = 0; 
                                        }
                                    } else {
                                        classes[0] = 26; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 4390; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[125] <= 71.9065350087773) {
                                classes[0] = 0; 
                                classes[1] = 175; 
                            } else {
                                classes[0] = 109; 
                                classes[1] = 0; 
                            }
                        }
                    }
                } else {
                    if (features[850] <= 15.517574242768395) {
                        if (features[87] <= 39.424749942321014) {
                            if (features[1120] <= 145.06978300484838) {
                                classes[0] = 1675; 
                                classes[1] = 0; 
                            } else {
                                classes[0] = 0; 
                                classes[1] = 111; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 100; 
                        }
                    } else {
                        if (features[182] <= 28.602033457262067) {
                            if (features[799] <= 16.68911712908161) {
                                if (features[380] <= 0.013394519563120065) {
                                    classes[0] = 205; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 313; 
                                }
                            } else {
                                if (features[1124] <= 94.93977071273126) {
                                    classes[0] = 0; 
                                    classes[1] = 94; 
                                } else {
                                    classes[0] = 406; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            if (features[1120] <= 109.09360485283419) {
                                if (features[1402] <= 4.160118025087) {
                                    classes[0] = 131; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[608] <= 8.572878534513883) {
                                        if (features[960] <= 91.84474673389839) {
                                            classes[0] = 14; 
                                            classes[1] = 1; 
                                        } else {
                                            classes[0] = 10; 
                                            classes[1] = 1; 
                                        }
                                    } else {
                                        classes[0] = 68; 
                                        classes[1] = 0; 
                                    }
                                }
                            } else {
                                if (features[221] <= 3.5426348074663716) {
                                    classes[0] = 0; 
                                    classes[1] = 2241; 
                                } else {
                                    if (features[388] <= 145.14704070031857) {
                                        if (features[102] <= 71.51962940559004) {
                                            classes[0] = 3; 
                                            classes[1] = 9; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 34; 
                                        }
                                    } else {
                                        classes[0] = 39; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (features[11] <= 84.50278452807235) {
                if (features[383] <= 197.01277101577196) {
                    if (features[1120] <= 105.0440655990558) {
                        if (features[1119] <= 11.003843649329582) {
                            if (features[99] <= 38.77520800976325) {
                                if (features[949] <= 195.40608471319035) {
                                    if (features[634] <= 23.07087167991462) {
                                        classes[0] = 0; 
                                        classes[1] = 10; 
                                    } else {
                                        classes[0] = 502; 
                                        classes[1] = 0; 
                                    }
                                } else {
                                    classes[0] = 1465; 
                                    classes[1] = 0; 
                                }
                            } else {
                                if (features[390] <= 77.00303219666216) {
                                    classes[0] = 2; 
                                    classes[1] = 8; 
                                } else {
                                    classes[0] = 23; 
                                    classes[1] = 0; 
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 851; 
                        }
                    } else {
                        if (features[1423] <= 88.495235695149) {
                            if (features[390] <= 252.12779635784247) {
                                if (features[221] <= 35.87936883134738) {
                                    if (features[251] <= 1.8621313839128721) {
                                        classes[0] = 0; 
                                        classes[1] = 4952; 
                                    } else {
                                        if (features[1021] <= 39.25097971077209) {
                                            if (features[221] <= 8.738228065631002) {
                                                if (features[830] <= 8.24350001479702) {
                                                    if (features[948] <= 61.890692415352824) {
                                                        classes[0] = 3; 
                                                        classes[1] = 7; 
                                                    } else {
                                                        classes[0] = 0; 
                                                        classes[1] = 35; 
                                                    }
                                                } else {
                                                    classes[0] = 0; 
                                                    classes[1] = 97; 
                                                }
                                            } else {
                                                classes[0] = 0; 
                                                classes[1] = 543; 
                                            }
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 910; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 5802; 
                                }
                            } else {
                                if (features[216] <= 30.12357345558431) {
                                    classes[0] = 15; 
                                    classes[1] = 1; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 400; 
                                }
                            }
                        } else {
                            if (features[996] <= 14.037814269203787) {
                                if (features[254] <= 124.23306975626338) {
                                    classes[0] = 0; 
                                    classes[1] = 1189; 
                                } else {
                                    classes[0] = 277; 
                                    classes[1] = 0; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 2219; 
                            }
                        }
                    }
                } else {
                    if (features[85] <= 47.90460707696487) {
                        classes[0] = 0; 
                        classes[1] = 11428; 
                    } else {
                        if (features[958] <= 84.97749089255777) {
                            if (features[391] <= 148.06494936702458) {
                                classes[0] = 0; 
                                classes[1] = 726; 
                            } else {
                                classes[0] = 10; 
                                classes[1] = 0; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3757; 
                        }
                    }
                }
            } else {
                if (features[1120] <= 118.06771654970532) {
                    if (features[160] <= 120.87161270312575) {
                        if (features[1124] <= 93.70907216132287) {
                            classes[0] = 16; 
                            classes[1] = 5; 
                        } else {
                            classes[0] = 148; 
                            classes[1] = 0; 
                        }
                    } else {
                        classes[0] = 758; 
                        classes[1] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 913; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static double[] predictProba(double[] features) {
        int n_classes = 2;

        int[] classes = new int[n_classes];
        double[] proba = new double[n_classes];

        classes[LivenessClassifier.predict_0(features)]++;
        classes[LivenessClassifier.predict_1(features)]++;
        classes[LivenessClassifier.predict_2(features)]++;
        classes[LivenessClassifier.predict_3(features)]++;
        classes[LivenessClassifier.predict_4(features)]++;
        classes[LivenessClassifier.predict_5(features)]++;
        classes[LivenessClassifier.predict_6(features)]++;
        classes[LivenessClassifier.predict_7(features)]++;
        classes[LivenessClassifier.predict_8(features)]++;
        classes[LivenessClassifier.predict_9(features)]++;

        int sum = 0;
        for (int i = 0; i < n_classes; i++) {
            sum += classes[i];
        }

        for (int i = 0; i < n_classes; i++) {
            proba[i] = classes[i] / (double) sum;
        }

        return proba;
    }

    public static void main(String[] args) {
        if (args.length == 1536) {

            // Features:
            double[] features = new double[args.length];
            for (int i = 0, l = args.length; i < l; i++) {
                features[i] = Double.parseDouble(args[i]);
            }

            // Probability:
            double[] probability = LivenessClassifier.predictProba(features);
            System.out.println(Arrays.toString(probability));

        }
    }
}