package cz.zr.base64;

public class Consts {

  public static final String IMAGE_FILE_NAME = "image.jpg";

  /** Example image in base64. */
  private static final String IMAGE_IN_BASE64 = "iVBORw0KGgoAAAANSUhEUgAAAN0AAAAtCAYAAAAqVm4DAAAAAXNSR0IArs4c6QAAAARnQU1B\n"
          + "AACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAB3FSURBVHhe7Vx5eFXHdZcAO4nTz9ma\n"
          + "xm2dNmnafEm6JG2apk2/hEUCf7ZrOyR24iZ2jPOlzWY2CWEWSQghMGCMY7PZGBOD8QJeMIsk\n"
          + "tKEV7TtoYZHYJLGIxSwSoIXT8zsz572rx31PT9Tor/vTN997ujNzZua+85tz5szcG0EePHgY\n"
          + "Vnik8+BhmOGRzoOHYYZHOg8ehhke6Tx4GGZ4pPPgYZjhkc6Dh2GGRzoPHoYZHuk8eBhmeKTz\n"
          + "4GGYETbp+vuv229ERUcu0G+3tdA3/lBFn5xXRCNm59NtcwvocwuK6ZsvVtMv3ztIb9WdpjOX\n"
          + "e2yNgbja20/PFRynOZlHKCHzMCXmHKeWs1ck77q/mUFx3RY+29VLi/LbaG7GYZrDaXHeMbp8\n"
          + "rU/ywkU/y1pZ3EazM0yf4jkl5LTR3hOXJX+wfml+dftFiud6kDE3o1X6ZJL5Pj/7CK0qaafU\n"
          + "5rN05NxVU4mhY1Fc43v0fJHpD/rilzO0pHXnZR+jjgvXrHSiK71dlHlwE+1oXsvpFdrRNDDt\n"
          + "bF5HWYfepKqOHDp+4QD19vvr9l/vt98MtO91Jwoo9dA6qRsoL1hCWdRp6qwQGYH3wQnNO3K+\n"
          + "kdJbXuW6SNzW/rVUfHSn5A0GlXHsw/2UZmW49Sv9wGtUcPh92neqhM51n5Q6QKj+hYuwSKft\n"
          + "tH14lR7dvJ9GJRRTRGI5RczdQxGzCzjlmzSnkCLibV58Cf3lkgqamdZCXT390lnlbdHhDyli\n"
          + "frUpl1BKESl76T/XVEs7QxmTTgSTtjRTxMIGllXCMstYdo20AQwmr9/qz7bGMxSRXGvqO/r1\n"
          + "7RWVtl+hBfXZvjz57n6KeIb7g77Mq3BPaIPv3aeTSyh6/T7aXN8pdQEd0/7ObrmHvvKBMsJN\n"
          + "vrHsow8azohsoLmzkuLyo2h65lianjWWYrLH3Zj4+rQMTmlRtCDvMdrWvIbOd5+W+tf5zwkQ\n"
          + "MSnnUZpZGC0yXeW5JMifXTKe1lbMFTnXAwgdiN7+Hpqf8zOaWWDaQd+RYnPG0YHOaikTOCk4\n"
          + "0X/dTMYbqxfSnNIJ0r5bv5Agd2raaHo6435aVR5LNR25Uvf/i7AtXeOpLrp7aZUodOTsPBo5\n"
          + "J59GzCnglC/fTSqgkWzx8H0UfxfFY+UCWYHePvND7WAFH5lUQbdz2VFcFp9QkNSms5LvtKrB\n"
          + "oCRoPdtNtycU0aj4QrG2kDVyXjmlsSUBBhOlbT2wYS+NmF9JH4vX/hvrjUmk+OgFKROqX5r3\n"
          + "xDvNNDK5yidHZLGcjyUU8rVCup2v43/cO5mkQAqegCZuahLrrHKaT3dxWTsmrnObM/E1yFD5\n"
          + "znaQ5yyHulI/sYRKMA5735pOl1NsFpMuNZqm7Bhr0k4mWKq5hjRt5zi+PoYm7xhNU9PHUFxe\n"
          + "FCXkTqRDZ+tFhnMigjIn7/45Tc+IoqlSz8jD92mpwVIUxaRNoJl5E2hrw2qR02dJEYi+fnO9\n"
          + "8XSZkGHaTrRj+j09dTzF5UbTa1XJUiY06UzehpoUits9nuXY8du++sbOfZNx7BxDU1JHywQ0\n"
          + "g8e/vjqRrvVdGXQSDoWwSHfxah99fTkrx7xKVup8Jp2xbPihxdqxkkuClePromT8Q4+cX0UP\n"
          + "v9EgMqBMalXerT9NkUy6USwLrinKR3L9762ukvxwxqOWJY4taURSlSgY+gWyRCZV0jvcBtBn\n"
          + "ie4GvXHHz19lN3kPRTIJ0B/IQRKZTIjfbD0g5bRNN2jeJCad9IfHL9Z/Vh5/8nfukySQjNuR\n"
          + "MXM+7iFIEbGgnh5k4ivp9p28bO7t3CJDTnz6EjwMlW1+C187WkeT1OVr/Hmgs0tkAyAdLIUo\n"
          + "LisWiPXU9h+wco2j2N2c2HJM28UKx/nIA/mg6KgzN/OHPEGoJ2H6C2UG6WA5oMQqb/JOJmza\n"
          + "GNc0hdNkbvvpomhxZY0cd9L5yFK9gGbkRgkptN/SP5Y1c9d9dOnaeSkXDD5LV7NQxgk5zr5i\n"
          + "3Ei4DyAbiId8mTx4/LDka8utVQ6w9uEiLNKl7D4qCnMbFJp/YE1we+5aWEJj1tbS91+qoS8t\n"
          + "LePrUDC2iCAg10ltMi4NCId1E/B69Ukh8G08k6uSC4ETyijzwDkpE8qqKD680kt/llJMkaxU\n"
          + "kKMERruvVZ6QMtqmG5Qozxcelz4rcTVJ31j2F7iNC9xWKKgsWLoInmyUVBFs0T6ZWEQ/2tRA\n"
          + "P+b0/Zdr2a3ke8OWHV5CpL2nsILwIjbVnBI5Jy5ek4nucwtKpP3POxLGjL6CbNpXfIeML/Dv\n"
          + "4SvLa2zU/VxKGbvvNdR1jX8Eez+cpFPFhdK9WDyV1lfOozVlT4u7iDK+fFG+KFH6fF7vAH39\n"
          + "5r6opTOk85MBVmgOk3R2xoM0ixM+B6aHKCn/EV7T77Vy7MzsAhB95q77hbDOPiGBFCDRnqPb\n"
          + "pWxw8vpJN2O3sWaoP4XHPiP9HnqlIp7WVSbwevopITEIKOPhfJSDFYTFq2zLFjnBLHMohEW6\n"
          + "b/CPP4JdRbiP+IENQUrpd9sOso/vV8arvdep/sRl7nA7fWtVHX1nZaUEBBSqmKtL2o2S8wyv\n"
          + "CmOsXQUTuEbKhOCKT87KYiNHrBvLQBILw0r/QlGblNGybsAsjfSvK6ookicQjEv6A+tg5UE2\n"
          + "SLyJJwogmDw30sl94snny0tLJU/RwYSavIMtNN9DvacoP4LH/91VZl0CIOB0rrtHJpcBie/5\n"
          + "P/6B12u85kN9mWjYgt7zar14JYF18L9OPqp0gaQTS8aWDQEGBYInmYdeZ5cR1tCUg2WAK7eh\n"
          + "OkXKqNIFkg5yY3LGsgLHS9AGhOnuuXRD6rp2kcdpgmjBoH1GsATE8k0UIAKnp7Yb0sE6LS/6\n"
          + "nZQN5v65kU7HnpT9qOQpPrzSSVv2Lufxs1W21httx2ZH0XOFv5EywdoJhbBI95lk43pBOTD7\n"
          + "Qyk/M3+PKAUAhQtsG53p7hk4a/XZf5cVsGVht01Jp0nJnNdqXJdQ1g7rQ1iCyEQoLtdDvzjd\n"
          + "ngBLV00L2TprOTeo7Kq2SzSCiSGWEgTghPHCCkXMspMBk278q3VSPtg9diOdyGBL+ddLSuVe\n"
          + "oIhzTPesr5eJRsui7Y/z2u8Yu7uD4VsvsKvK9wprZ7F6LOeBDftsbnBooOIG0m1noqSPpoNn\n"
          + "akQx+/r9kedn8p50kMm4X2vL50ieWqYbSRclBPljdZLkD4ZQyqtu3AtshWOzQRK2Tky2mNQJ\n"
          + "kqakghRwhcfQ9PRx1HbhoJR3c/+CkQ5jn5f9U+rpv8q18Fv5dXdFyXRpF/dK13iweBpUGirC\n"
          + "It1nQbq5lnSsHCOYdJ9IKmGFvSj5uF9KPMyowaxBr2VdcvYRsVBCEJYJucba8Xd2O6PX1Uo5\n"
          + "N9LpuvCDhk5RNLVOmm6LZ1kse86uVikXrC96PWanY02IdRGPDZMCJpVIXhMJGdhlRrDmQGe3\n"
          + "1HHTj8FIpxMU0MPfIWMj3Gxf25h0+H6w9cq3k465p+7pmyBdgKW7/7W9ktfHNymwvEKVzs3S\n"
          + "QfEOnTWTC8ohUgisLImVaN4UVlAoaVxeNL1d/5zkqbwbSceWhy3d+qp5ovx913vl0+0vFDT/\n"
          + "1OVjFJMeLUqPIEwcu7iQ/Vp1snxHe0hwfd9vWCV1+m3wxYngpBsjpNMxA9rnkmOp1sJG0VOw\n"
          + "sFwellEDSkNFWKT71otVNEIsCv+4qhysTHcvqaB39/rD3YAqihvU6sxKbxXFBOmchEESEvEM\n"
          + "XnTYPWKoosfyOlKtBNZFSl7jXlbT77cNHvzo7umjv1pcKmMRxZ1TJOulS+yi/cfqagnuoD9i\n"
          + "SVhmEk8WgJvMoKRjKxpIOh3T9sYzMga0oevRSCbPrv2DR16FdNY9lb6zHJAOCLWODUa6qew+\n"
          + "QZFazxkZCkTq5mZPNIEPKDwsGFu6vSeLJT+4e2ksHYgBhCJXMH0BtL9p+/8ohBJygXT5UVTd\n"
          + "vptqO/IlqiqRVh4LyJOQ9Yj02w3BSIexB5JOrR32H42lw/oPY2PXmV3Z5tOVkj9UhEU6bDZL\n"
          + "4MMRucS2gUTFeC30ndV1vPg+OWBDOpRiTt5+UJRYI3yQKSF0UTyWzwp0L7tegJN0+r3i+EVe\n"
          + "Y1qX0FEXckQB2Xo8vqVZyqpldEIjmjuazoiFUGJFMll+8maj5M3LYmuMPvJ1KHYkr2n/blkZ\n"
          + "9QRxV4OSztXSmbLYjNc2zD3g8mxpy3l8gJulV3zUpBPisaXD9Z6+q7w2PCcEXFU2w6zpWNlQ\n"
          + "Ztae8RJsgZvqJFIg6WCNfJaOy2J9iDLOhCBMKMIpYHEW7H5M+iEkgWuZNp4uXD0r0Up8F7eP\n"
          + "28XaC4SoO1Fo6gZYO7QLBHMvnaTT77kt71jCm0gn0pS00XTcsf4dCsIi3cWrvbx+wmbrwC0D\n"
          + "KAkUFj8+gg1fea6SnslvoxMX3NckquwaVhd30spCeBvfkaBICNyUHRuofPr52NuNPrdM6rKF\n"
          + "0vA5IqJQwImv260Klx9V5YBgIBrkqOK+XWf89Ep2nUfEY21nCGHGWUZZB92jq4ORDlYVfXF2\n"
          + "599W1UgAR8vCnf10UhGd7fL/8MFwK0iHhIhiQtbDNCvjAbFu2BPD7A6lnpl1L71Wk8yT6wVD\n"
          + "Okc7kOsknchjcsSl30spuY9LnjMtyH1Mri8ufoJqOvKsjIEzpP5/gNeZ0xDMgCVjksDqvLBn\n"
          + "iuQBK4qnifVFHsgOMgWuORWDke4aTzio45xQlhb+j9wrMy4ui+2J9Pupq8fo51ARFukAHIe6\n"
          + "awn/0KzsUED80EIS/tF9PzwsH+d/flE5LS0w0UMnVE8feaNBSCoEYRnY0/v755nUPMsbN4uV\n"
          + "lQn+0EarRFxRf+Cj56/QHfOYDLLGNIGHry4ze19QXFO3nMavCx34OHnxGt2ZZAJE6L8Gh/To\n"
          + "Gkj0D8+zXFFsvyX8ORMeCId0QlSX6CU29H+2eb94CSiD+6jyH9pogiGB8gNxq0iHIAH2vGBN\n"
          + "jJKzsjHhpqaNpRVlU2l/p9lLBUJZOsjC3hfk4dq0XZzw6UgIgMwqHs9rsJUiQ7cfFEqYN2qX\n"
          + "+F1LTjPYbc1tfUfygPzW9+yayxAIcmPTJ/iObwVODoCbexkYvTzT1SGBIEw8OibTfhS9Yk/Q\n"
          + "BJI6HIRFOlUAKMv9G9nKwLLxjwxlcZJPlB6KBiVOrqWH2NpckSNgUt33+V+sHKivlm4kE2ht\n"
          + "WYeJktrgxUiQgV3I6vZLUkfdutmyHqwWoiKqOPrlWnoa12A5UY/lQZmxL+UGJYdv24L7L1FU\n"
          + "/j7xdaPw2tasXa0UmVwjZTAZRLJF/RQT89Ql/zlEhRvpMDZsWH+CJ4bxr9ZLtPK7vFa8I5Et\n"
          + "M48fMjHpCKnj+Rpb9+Ijg0dugVtBOpAEayIhiCRDPija5O3GpYrJHktL9/yKDp2x7r9VOjfS\n"
          + "IYlCs1vmlmLT76Gn8+6hHc3rREagKwh0914S64t+YRKYwjKnp0XT6cvHbQmizq52G2TBRIE1\n"
          + "lyFG9qG3JF/HDLiRTvoqLusEWlkSQ6tKZ9Czhb+mWP5fAkh2PLKmTeO+8305fE49qVtEOsCp\n"
          + "BFkHz9NDm5rY2rCisOJDcfxKZtxOkAKnLJ58p0nqoL7qQjRbIayloOxiZZgkOGb2+21Y6xkl\n"
          + "F4vFsh/eZIiAutiDumthMUWy2ydHxxbUyWbycmxu83efPFbGf/qD+yJXZ73v2UAJ+m324qpo\n"
          + "fcUJ/uERYOkXEhW0nhciCOE4oV8o9xJPEIASDXAjHe6F76QIk0ISjxWTklhBK1fyuf/J2YdF\n"
          + "xmCEA24F6aBUidk/oUV5k2hh3hM0P+e/Zb0E100JhISZPy5rArU4ondQPjdLB7LASkHB5dOR\n"
          + "sPaaW3GP/wiYw9Jp5LH8eKZ1HY1rieNYIATGgbUeEr4v42vIQxlZ1/HYsNURSIpgpNMTKSAZ\n"
          + "3FdxJ0FilqX3R9zl/CjatX+jyLgZwgFhkw7Ab+n8PSvbLtGkdw/QHUk4fVIlCuQjHidxH+NL\n"
          + "JPABqGIiMgjlg7LImomVB5vqsKSjEkvlmlg7toA4XK3WDqfzjXXidpjwd84vFku6BIEetn6I\n"
          + "hqpLh6CHkxSA9r3+xCUaaddr4t6xLDwhcYXXXYGQTWg5GGAnFibqv6/S42p++W6k03uBT0xC\n"
          + "SHpdE8Z4Z0o5Lc4z+4qhCOPER006mcV5Bj94xmzXmOBHD53tPkEZ2CBPZwVNhSIay4W6yTk/\n"
          + "l6ALALlO0iGBcDjVAvfw9ZpFtKn2GU6LTap5hq8vps0Ny/z7ao5+q+u6qiTWt15DAlkLDm+V\n"
          + "PCcKj2yTPEMiJhC3D2ut0VinRQZusHQ26dnLwOsY+6zs+9jgmONqut95MxgS6RTQL+fviv2r\n"
          + "p7a3mE1mViINPgg52D0L3DPzK4whJ5ReiTmR13GwcLB0all+ZtdR3+B1HzbDxYry9V++ayKU\n"
          + "El3l/4V0qMNryy8uLqVuHHtyQNufzf3RqCHIjfUcjk1NYqv8+OYm+sWWZol+PskE+hscbbOb\n"
          + "5xiTTAhM2Bo7EahVciPdAEvH/cN1EzDKE1lKlpdL26WuHh4IBx856bYb0uk+nZMAQPr+DT6L\n"
          + "I+VhTdiyNJwqkXwQ1Ek6KC3WWTgrOVRo252X28SVhIWRNuE68npzddlMIe3GmhRJIPPqsjjf\n"
          + "toaQxBL0rfplImsw0qmlE4vMSc6FskttZPFY2a3ec2SH1A1cew4VN0U6BX5cpzVZU9ox4DiV\n"
          + "zOqsbAicALiXSF97DoejS9itMxvuUEpstONmI2KpR86EvKykn0oqMuc/uRwUdgR/guAaWpez\n"
          + "kyARk1HWSSwXG/rnum68OTiW9pWlpbIFIK4ol5c+cB3IEHJowv8IDtnIKMqZiaCaYnYeEnk6\n"
          + "fjfSGUIX0Z+yFV3DxHqlvEOCKqZtrOV4PDyOrz1fKRHLcNxKxUdOOrEMTtIZJcU+HOp0Xm43\n"
          + "h4OFAFwWx8HyomX/DOjtv3oD6bBl8GplotR32zLQ5AzIALgG4Hk/v/UyBAA54AIqOTThmhDH\n"
          + "lkMCCXHeE8fNFCo7MJCC9SrKFrHF3HN0B1von/qOvyHBai7Kf4JlXWQZN2/lgCGTDsoF3XD+\n"
          + "rvgfwQfk3ZWCU+7mALIhXSX9yK7LACj9l9l6wAWUfC4HcjWcNA+LAveur5N6mi8WwxJUrrGC\n"
          + "jX7ZHyiBMoMkWh4RyU8mFlK7fWgTfVWFzjhwTlxbnRhM9NWQCZHQwITHa5z9UKLcvaiEulz2\n"
          + "JZ2kg1yME9ZSkYX2mSzIx7hlPcnr2Mc3G2uucgbDrSAd3MFA0oEQ+H7+yml2K2F1jGKDdCCE\n"
          + "nv5ws3S6Twdou+ECbS7KncRrs4BABrdrXMDxAck8jiME8lk785xd+fEMkYl1Io54AYGkw4ST\n"
          + "xGtYRaPv/hjCw7JjEx5uMjDU8TgRNumw8a3HuILhILuZdySVWBcTazpWULYWv7WPxgCQ8+cL\n"
          + "8ZxdkShMhDybV0BNp/yPnRS0fsgKZayBEMOR9ADyW7XmND7wRo3jqQXkczmQ6NAZPbaFx4qM\n"
          + "Ij72dpNvb85n5RLZ8sKqBUuweras9AFBHlby9/eZ0zgyEbmQTvpi9+lAUD2R87/voQzcWyMP\n"
          + "9wny3rZjCsfi3Qr3EntVevayn10ozOg6q2MvTQMVhnTRQrrglm7giZRwoe1hLQbrooQTErHl\n"
          + "QpuhEiYOX3nuK4IiLxZPE5mYQDRCGkg6/z7dFQnOAJtqFotMDabIhj/Lq2rLkfybtXhhke4a\n"
          + "K8t3V1XR11+olcf/cw6dp44LV9m6mUZh5fCA5L+srBlAFiXIJiaF4gy7UdgPg+WCUsLSOAmi\n"
          + "M/0YtmS+Y15W2dXKfPEZY2VUOfHsHJQOZND1JOQiYAKoTGlbtyW4jLiiTIoHN+yjmNQWnskP\n"
          + "0XSX9GueNJwklcmEx/XABv+pGTdLJ6Tj/uKRJ33aAmVx8v+LS8qsG236ge2Rz6aU0nH7wG8I\n"
          + "3ghulXvpfMoAwIQFIibuftiQwFce65xxVNtRIOVutHScj6cMKuIl2HKl97IodLCkUFJs3rvc\n"
          + "kEhIzn1LHyuR1ff2reS0gt5r4E9n4muwuim5v3C4hcbqTU+LopOX7AF4ux5zs3TmRIrJB0Hh\n"
          + "SibmPMzyUAbjNv2Ynf2gWH7cG/wNFWGRbjeTDMqDdZjM+qwsd/I662+XldO3V1TRV7FGw5qI\n"
          + "lUAODUOJoEysSAhQOB//wVPkd7Drpw+MRswqkPB/yxlz49UaZBw4O9ANhLJDudhC4P0jwDV7\n"
          + "nApnGOU4ly2nFqbUnmjRfbdXK04YN9QqOvrwJ0l75FGZwfC9NZgEzBaD1v1EYpFs1gO9IUjn\n"
          + "PAam5NQ+66QiExRb6wn2aQYtFwwfNekk8XoNR7ywDltXmSD7VQtzn5ANbrEgjsDC9F3jaE7G\n"
          + "D6mbyQRArpN0Kg97XwlZP6Z4TjjpEp/J323CdRBpftEj8k4SxdXeLpqbOdFaLeOqgoBY4w2G\n"
          + "irYssbA6OZi64+RdKECPfddLcNKZwxF6n+o6CiWI4p+cjMuKQ+CAlhsKwiIdnpzGs14ghwQr\n"
          + "oCAgGUiIfScmIRQHCqCEw1oIG+TY9AaUTLBoajVQDp/YPNbHWaAvGr2CdXUqujzdMK+YDp8b\n"
          + "qOhYp5njVIbIQlT+Xx+IVQV2HpIWZWdrpYqqa1L0UxMMOciC688Xtglh0XfnBIDtCkBJ5Xxy\n"
          + "XMYHS8ekc3uuUI+zjZpjopkqc3mBkRnKzdRHe9CGkg6HDoDQpDP9cJJO10ASpMgyUUcoluxX\n"
          + "MYmMshmrIUqaym4er290rSTuO8v1k87U0YggyBMsIR97X6uZ4Irq9lyxoj5F53anpY+jjout\n"
          + "ouR47AgRxAHJ7tfhLGZc+n0m+ih95gmC+4T3qqCcjh+kwzjNOtAcBAg8e6l7hX+snG+IbMcl\n"
          + "RObx4yTMzSAs0slTzYg28o+LHxnkMu9CsYm/SyhdFIAVjd23iAW1FJtqInxQHlWEBl67qdJD\n"
          + "yVAXQQ8n6fSQ8tYGtgb2vCeCGiPYgvzInhoRmVYpc1vOi6sm7x/hPmBLAe9g2WrXXAC2NT6e\n"
          + "iKcJCn1l4PrC+gHBLItOAK1nr8jjPaiPfktbSWWi/Kir9Se9639HCtZscBsROHIeeBa3hIvD\n"
          + "3f3CIriZxWZCg9yEPXTH/FJ5XYMpKx834J9frKSRiaVST8eL97wA2mc36MwM0g32jhQkIRlf\n"
          + "B4F0TRWbGU27W7aIHFViyMV5Std3pIRIManj5V0lr9hXIAA4NynvL+H25eQK93NJ/q/sfQs1\n"
          + "NtMXWOm4XBNgkTHJvuI4ajzlD2iBdPqOlKk7eHJhy409RSfppD3+w+Hv2VkPMjHRZzO+mF3R\n"
          + "NDPzPmq/0GJLh4+wSPfom430+YWlxrKx5cEMK8TC/hPP0JJg+Vjx4TLdvbSSXrYWTomhNwvr\n"
          + "LAlcSGIriZmeFQdnIZ1AcSgylAsnW6RNLgtXF4Bcvf91HZetPHviA2UXNtCbjmALXoFn3tLF\n"
          + "brJtF5OJ87V0waDt4DyneesYy9f+z6+hUvviIuAXW5q4HU5yL7hcch39xaISn4ur0Psi61Em\n"
          + "v8iCTNRL2UdfW14hRA2mZHLeVO8L6nC/cNIHCMfS7Q/nbWA2oQws0rzdP6G39z5LbRfMZAqF\n"
          + "VEAuLMXNvg3spfJZIgfnHSezOwtLKy8gsvlZB9+Q/FDunK4H8YRBXIF/bCKjdII8e6fA/qG+\n"
          + "DQzlZnJ5uLywhk7o/apqzxFrB3lG5hiamR9NCdkPS/5QEBbpALxiYEt9J7O8hX6wtk42n7E2\n"
          + "0zUFSPmDtfW0rLCdTlkCqWI5gVMfS/KP8YzRIi8VmpZ6WF67EKgo+i8OWsdlHJV2Xyzyn7dz\n"
          + "Am7ms+ySTdvZSjNSWyQoMivjiLxnRJHefJZns2PserTQDLSbdsQXAQ01ewKajdfizcw4xha8\n"
          + "RZJbO9hnjNl1VNpAX9AOHlYFAtvRf/EqiOlcDnUgF8Gb+IzDctomGDCpQTbakHbSj/LvY1+P\n"
          + "F3o4ArxCAescHDZGAMJ82rTPJr6O6GTxsR3Ucq5egiEK9jPsN/+48N6Qrc0r5ViXqT9YWiVl\n"
          + "tx1YLU8SAHAPtzW+JAET5CNAsrP5lSGd6AcxYYnfb1xBWxtXSxvo196Te2wJ4iXKPvpgv82z\n"
          + "+RVtmZJ3w+9kJ5eyY7v848M94z5+0LhG8oaCsEnnwYOHjwYe6Tx4GGZ4pPPgYZjhkc6Dh2GG\n"
          + "RzoPHoYZHuk8eBhmeKTz4GGY4ZHOg4dhhkc6Dx6GGR7pPHgYVhD9H2LaD3Z6rFPPAAAAAElF\n"
          + "TkSuQmCC";

  public static final String BASE64DATA_WITH_HEADER = "data:image/png;base64," + IMAGE_IN_BASE64;

}