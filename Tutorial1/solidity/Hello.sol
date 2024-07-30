
pragma solidity ^0.8.4;

contract SimpleStorage {
    
    function countVowels(string memory str) public pure returns(unit) {

        unit c = 0;
        for(unit i=0;i<bytes(str.length);i++)
        {
            if(isVowel(str[i]))
            {
                c++;
            }
        }
    }
    function isVowel(byte ch) public pure returns (bool) {
        if(ch == 'A' || ch =='E' || ch=='I' || ch=='O' ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            return true;
        }
        return false;
    }
}
